package br.com.restdemo.demo.service.artist.mapper.response;

import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;

public class ArtistServiceResponseMapper {
    public static ArtistServiceResponse toServiceResponse(ArtistIntegrationResponse artistIntegrationResponse){
        return ArtistServiceResponse.builder()
                .id(artistIntegrationResponse.getId())
                .name(artistIntegrationResponse.getName())
                .link(artistIntegrationResponse.getLink())
                .share(artistIntegrationResponse.getShare())
                .picture(artistIntegrationResponse.getPicture())
                .nb_album(artistIntegrationResponse.getNb_album())
                .nb_fan(artistIntegrationResponse.getNb_fan())
                .tracklist(artistIntegrationResponse.getTracklist())
                .type(artistIntegrationResponse.getType())
                .build();
    }
}
