package br.com.restdemo.demo.service.track.mapper.response;

import br.com.restdemo.demo.integration.track.model.response.TrackIntegrationResponse;
import br.com.restdemo.demo.service.track.model.response.TrackServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TrackintegrationResponseMapper {
    public static TrackServiceResponse toServiceResponse(TrackIntegrationResponse trackIntegrationResponse){
        return TrackServiceResponse.builder()
                .id(trackIntegrationResponse.getId())
                .url(trackIntegrationResponse.getUrl())
                .subtitle(trackIntegrationResponse.getSubtitle())
                .type(trackIntegrationResponse.getType())
                .title(trackIntegrationResponse.getTitle())
                .build();
    }
}
