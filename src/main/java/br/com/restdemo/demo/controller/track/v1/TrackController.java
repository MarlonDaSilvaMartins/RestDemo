package br.com.restdemo.demo.controller.track.v1;

import br.com.restdemo.demo.integration.track.TrackIntegration;
import br.com.restdemo.demo.integration.track.model.response.TrackIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("v1/track")
public class TrackController {

    TrackIntegration trackIntegration;

    @GetMapping("/{id}")
    public TrackIntegrationResponse findArtist(@PathVariable String id){
        return trackIntegration.findTrack(id);
    }
}
