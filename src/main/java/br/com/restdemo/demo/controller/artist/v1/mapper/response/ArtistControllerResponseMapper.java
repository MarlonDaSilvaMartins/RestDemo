package br.com.restdemo.demo.controller.artist.v1.mapper.response;

import br.com.restdemo.demo.controller.artist.v1.model.response.ArtistControllerResponse;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ArtistControllerResponseMapper {
    public static ArtistControllerResponse toControllerResponse(ArtistServiceResponse artistServiceResponse){
        return ArtistControllerResponse.builder()
                .id(artistServiceResponse.getId())
                .name(artistServiceResponse.getName())
                .link(artistServiceResponse.getLink())
                .share(artistServiceResponse.getShare())
                .picture(artistServiceResponse.getPicture())
                .nbAlbum(artistServiceResponse.getNbAlbum())
                .nbFan(artistServiceResponse.getNbFan())
                .tracklist(artistServiceResponse.getTracklist())
                .type(artistServiceResponse.getType())
                .build();
    }
}
