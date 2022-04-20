package br.com.restdemo.demo.service.artist.mapper.request;

import br.com.restdemo.demo.integration.artist.model.request.ArtistIntegrationRequest;
import br.com.restdemo.demo.service.artist.model.request.ArtistServiceRequest;

public class ArtistServiceRequestMapper {
    public static ArtistIntegrationRequest toServiceRequest(ArtistServiceRequest artistServiceRequest){
        return ArtistIntegrationRequest.builder()
                .artistId(artistServiceRequest.getArtistId())
                .build();
    }
}
