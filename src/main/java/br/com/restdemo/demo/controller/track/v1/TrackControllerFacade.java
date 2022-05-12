package br.com.restdemo.demo.controller.track.v1;

import br.com.restdemo.demo.controller.track.v1.model.response.TrackControllerResponse;
import br.com.restdemo.demo.service.track.TrackServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static br.com.restdemo.demo.controller.track.v1.mapper.response.TrackControllerResponseMapper.toControllerResponse;

@Component
@AllArgsConstructor
public class TrackControllerFacade {
    private final TrackServiceFacade trackServiceFacade;

    public TrackControllerResponse findTrack(String trackId){
        return toControllerResponse(trackServiceFacade.findTrack(trackId));
    }
}
