package br.com.restdemo.demo.controller.artist;

import br.com.restdemo.demo.controller.artist.model.request.ArtistControllerRequest;
import br.com.restdemo.demo.integration.artist.ArtistIntegration;
import br.com.restdemo.demo.integration.artist.model.request.ArtistIntegrationRequest;
import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("v1/artist")
public class ArtistController {
    ArtistIntegration artistIntegration;

    @GetMapping("/{artistId}")
    public ArtistIntegrationResponse getArtist(@PathVariable ArtistControllerRequest artistId){
        return artistIntegration.getArtist(ArtistIntegrationRequest.builder()
                .artistId(artistId.getArtistId())
                .build());
    }
}
