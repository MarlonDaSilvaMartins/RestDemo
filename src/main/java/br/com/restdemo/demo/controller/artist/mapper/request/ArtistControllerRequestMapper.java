package br.com.restdemo.demo.controller.artist.mapper.request;

import br.com.restdemo.demo.controller.artist.model.request.ArtistControllerRequest;
import br.com.restdemo.demo.service.artist.model.request.ArtistServiceRequest;

public class ArtistControllerRequestMapper {
    public static ArtistServiceRequest toControllerRequest(ArtistControllerRequest artistControllerRequest){
        return ArtistServiceRequest.builder()
                .artistId(artistControllerRequest.getArtistId())
                .build();
    }
}
