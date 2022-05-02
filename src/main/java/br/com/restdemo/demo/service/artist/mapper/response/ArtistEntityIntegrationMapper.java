package br.com.restdemo.demo.service.artist.mapper.response;

import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import br.com.restdemo.demo.model.artist.ArtistEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ArtistEntityIntegrationMapper {

    public static ArtistEntity toIntegrationResponse(ArtistIntegrationResponse artistIntegrationResponse) {
        return ArtistEntity.builder()
                .id(artistIntegrationResponse.getId())
                .name(artistIntegrationResponse.getName())
                .link(artistIntegrationResponse.getLink())
                .share(artistIntegrationResponse.getShare())
                .picture(artistIntegrationResponse.getPicture())
                .nbAlbum(artistIntegrationResponse.getNbAlbum())
                .nbFan(artistIntegrationResponse.getNbFan())
                .tracklist(artistIntegrationResponse.getTracklist())
                .type(artistIntegrationResponse.getType())
                .build();
    }

}
