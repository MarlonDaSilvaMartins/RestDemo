package br.com.restdemo.demo.controller.artist;

import br.com.restdemo.demo.controller.artist.model.response.ArtistControllerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("v1/artist")
public class ArtistController {
    ArtistFacade artistFacade;

    @GetMapping("/{artist}")
    public ArtistControllerResponse findArtist(@Valid @PathVariable String artist){
        return artistFacade.findArtist(artist);
    }

    @DeleteMapping("/{artistId}")
    public String deleteArtist(@Valid @PathVariable String artistId){
        return artistFacade.deleteArtist(artistId);
    }
}
