package br.com.restdemo.demo.controller.track.v1.mapper.response;

import br.com.restdemo.demo.controller.track.v1.model.response.TrackControllerResponse;
import br.com.restdemo.demo.service.track.model.response.TrackServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TrackControllerResponseMapper {
    public static TrackControllerResponse toControllerResponse(TrackServiceResponse trackServiceResponse){
        return TrackControllerResponse.builder()
                .id(trackServiceResponse.getId())
                .url(trackServiceResponse.getUrl())
                .subtitle(trackServiceResponse.getSubtitle())
                .type(trackServiceResponse.getType())
                .title(trackServiceResponse.getTitle())
                .build();
    }
}
