package br.com.restdemo.demo.service.artist;

import br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityResponseMapper;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ArtistServiceFacade {
    private final ArtistService artistService;

    public ArtistServiceResponse findArtist(String id) {
        return artistService.findArtistById(id)
                .map(ArtistEntityResponseMapper::toArtistEntity)
                .orElseGet(() -> artistService.findArtistIntegration(id));
    }

    public void deleteArtist(String id) {
        artistService.deleteArtist(id);
    }
}
