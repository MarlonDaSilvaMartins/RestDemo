package br.com.restdemo.demo.service.track;

import br.com.restdemo.demo.service.track.model.response.TrackServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TrackServiceFacade {
    private final TrackService trackService;
    public TrackServiceResponse findTrack(String trackId){
        return trackService.findTrack(trackId);
    }
}
