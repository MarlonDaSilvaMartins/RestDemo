package br.com.restdemo.demo.service.artist;

import br.com.restdemo.demo.configuration.exceptions.DataNotFoundException;
import br.com.restdemo.demo.integration.artist.ArtistIntegration;
import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import br.com.restdemo.demo.model.artist.ArtistEntity;
import br.com.restdemo.demo.repository.artist.ArtistRepository;
import br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityIntegrationMapper;
import br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityResponseMapper;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
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

    public Optional<ArtistEntity> findArtistById(String id) {
        return artistRepository.findById(id);
    }

    public ArtistServiceResponse findArtistIntegration(String id) {
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
                throw new DataNotFoundException("id");
            }
            return artist;
        };
    }

    public void deleteArtist(String id) {
        artistRepository.deleteById(id);
    }

}
