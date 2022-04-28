package br.com.restdemo.demo.service.artist;

import br.com.restdemo.demo.configuration.exceptions.DataNotFoundException;
import br.com.restdemo.demo.integration.artist.ArtistIntegration;
import br.com.restdemo.demo.model.artist.ArtistEntity;
import br.com.restdemo.demo.repository.artist.ArtistRepository;
import br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityIntegrationMapper;
import br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityResponseMapper;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import java.util.Optional;
import java.util.function.Function;

@Service
@AllArgsConstructor
public class ArtistService {

    private final ArtistIntegration artistIntegration;
    private final ArtistRepository artistRepository;

    public ArtistServiceResponse findArtist(String id) {
        Optional<ArtistEntity> find = artistRepository.findById(id);
        if(find.isPresent()){
            return find.map(ArtistEntityResponseMapper::toArtistEntity).get();
        }else{
            return findArtistIntegration(id);
        }
    }

    public String deleteArtist(String artistId) {
        artistRepository.findById(artistId)
                .ifPresent(artistEntity -> artistRepository.deleteById(artistId));
        return artistId;
    }

    private ArtistServiceResponse findArtistIntegration(String id) {
        return Optional.of(artistIntegration.findArtist(id))
                .map(artistValidation())
                .map(ArtistEntityIntegrationMapper::toIntegrationResponse)
                .map(artistRepository::save)
                .map(ArtistEntityResponseMapper::toArtistEntity)
                .orElseThrow(() -> new DataNotFoundException("id"));
    }

    private Function<ArtistIntegrationResponse, ArtistIntegrationResponse> artistValidation() {
        return artist -> {
            if(ObjectUtils.isEmpty(artist.getName())){
                throw new DataNotFoundException("artist not found");
            }
            return artist;
        };
    }

}
