package br.com.restdemo.demo.integration.artist;

import br.com.restdemo.demo.integration.artist.model.request.ArtistIntegrationRequest;
import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
@AllArgsConstructor
public class ArtistIntegration {

    private final RestTemplate restTemplate;

    public ArtistIntegrationResponse getArtist(ArtistIntegrationRequest artistIntegrationRequest){
        return restTemplate.getForObject("/artist/".concat(artistIntegrationRequest.getArtistId()) , ArtistIntegrationResponse.class);
    }
}
