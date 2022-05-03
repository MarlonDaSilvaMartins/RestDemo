package br.com.restdemo.demo.controller.artist.v1;

import br.com.restdemo.demo.configuration.exceptions.DataNotFoundException;
import br.com.restdemo.demo.controller.artist.v1.mapper.response.ArtistControllerResponseMapper;
import br.com.restdemo.demo.controller.artist.v1.model.response.ArtistControllerResponse;
import br.com.restdemo.demo.service.artist.ArtistServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
@AllArgsConstructor
public class ArtistControllerFacade {
    ArtistServiceFacade artistServiceFacade;

    public ArtistControllerResponse findArtist(String artist){
        return Stream.of(artistServiceFacade.findArtist(artist))
                .map(ArtistControllerResponseMapper::toControllerResponse)
                .findFirst()
                .orElseThrow(() -> new DataNotFoundException("Not Found"));
    }

    public void deleteArtist(String id){
        artistServiceFacade.deleteArtist(id);
    }
}
