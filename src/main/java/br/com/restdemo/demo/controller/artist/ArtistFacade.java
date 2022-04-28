package br.com.restdemo.demo.controller.artist;

import br.com.restdemo.demo.controller.artist.mapper.response.ArtistControllerResponseMapper;
import br.com.restdemo.demo.controller.artist.model.response.ArtistControllerResponse;
import br.com.restdemo.demo.service.artist.ArtistService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ArtistFacade {
    ArtistService artistService;

    public ArtistControllerResponse findArtist(String artist){
        return ArtistControllerResponseMapper.toControllerResponse(artistService.findArtist(artist));
    }

    public String deleteArtist(String artistId){
        return artistService.deleteArtist(artistId);
    }
}
