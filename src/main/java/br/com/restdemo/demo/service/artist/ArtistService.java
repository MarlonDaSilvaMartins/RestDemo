package br.com.restdemo.demo.service.artist;

import br.com.restdemo.demo.integration.artist.ArtistIntegration;
import br.com.restdemo.demo.repository.artist.ArtistRepository;
import br.com.restdemo.demo.service.artist.model.request.ArtistServiceRequest;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static br.com.restdemo.demo.service.artist.mapper.request.ArtistServiceRequestMapper.toServiceRequest;
import static br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityIntegrationMapper.toServiceResponse;
import static br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityResponseMapper.toServiceResponse;


@Service
@AllArgsConstructor
public class ArtistService {
    private final ArtistIntegration artistIntegration;
    private final ArtistRepository artistRepository;

    public ArtistServiceResponse getArtist(ArtistServiceRequest artistServiceRequest){
        return toServiceResponse(artistRepository.findById(artistServiceRequest.getArtistId())
                        .orElseGet(() -> artistRepository.save(toServiceResponse(artistIntegration
                                .getArtist(toServiceRequest(artistServiceRequest))))));
    }
}
