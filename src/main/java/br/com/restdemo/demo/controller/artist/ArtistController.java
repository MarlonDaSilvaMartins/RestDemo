package br.com.restdemo.demo.controller.artist;

import br.com.restdemo.demo.controller.artist.model.request.ArtistControllerRequest;
import br.com.restdemo.demo.controller.artist.model.response.ArtistControllerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("v1/artist")
public class ArtistController {
    ArtistFacade artistFacade;

    @GetMapping("/{artistId}")
    public ArtistControllerResponse getArtist(@PathVariable ArtistControllerRequest artistId){
        return artistFacade.getArtist(artistId);
    }
}
