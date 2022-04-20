package br.com.restdemo.demo.controller.artist.mapper.response;

import br.com.restdemo.demo.controller.artist.model.response.ArtistControllerResponse;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;

public class ArtistControllerResponseMapper {
    public static ArtistControllerResponse toControllerResponse(ArtistServiceResponse artistServiceResponse){
        return ArtistControllerResponse.builder()
                .id(artistServiceResponse.getId())
                .name(artistServiceResponse.getName())
                .link(artistServiceResponse.getLink())
                .share(artistServiceResponse.getShare())
                .picture(artistServiceResponse.getPicture())
                .nb_album(artistServiceResponse.getNb_album())
                .nb_fan(artistServiceResponse.getNb_fan())
                .tracklist(artistServiceResponse.getTracklist())
                .type(artistServiceResponse.getType())
                .build();
    }
}
