package br.com.restdemo.demo.service.track;

import br.com.restdemo.demo.integration.track.TrackIntegration;
import br.com.restdemo.demo.service.track.model.response.TrackServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static br.com.restdemo.demo.service.track.mapper.response.TrackintegrationResponseMapper.toServiceResponse;

@Service
@AllArgsConstructor
public class TrackService {
    private final TrackIntegration trackIntegration;

    public TrackServiceResponse findTrack(String trackId){
        return toServiceResponse(trackIntegration.findTrack(trackId));
    }
}
