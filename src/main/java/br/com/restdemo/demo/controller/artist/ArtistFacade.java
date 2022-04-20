package br.com.restdemo.demo.controller.artist;

import br.com.restdemo.demo.controller.artist.model.request.ArtistControllerRequest;
import br.com.restdemo.demo.controller.artist.model.response.ArtistControllerResponse;
import br.com.restdemo.demo.service.artist.ArtistService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static br.com.restdemo.demo.controller.artist.mapper.request.ArtistControllerRequestMapper.toControllerRequest;
import static br.com.restdemo.demo.controller.artist.mapper.response.ArtistControllerResponseMapper.toControllerResponse;

@Component
@AllArgsConstructor
public class ArtistFacade {
    ArtistService artistService;
    public ArtistControllerResponse getArtist(ArtistControllerRequest artistId){
        return toControllerResponse(artistService.getArtist(toControllerRequest(artistId)));
    }
}
