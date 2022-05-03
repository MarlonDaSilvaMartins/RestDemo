package br.com.restdemo.demo.service.artist;

import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import br.com.restdemo.demo.model.artist.ArtistEntity;
import br.com.restdemo.demo.repository.artist.ArtistRepository;
import br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityIntegrationMapper;
import br.com.restdemo.demo.service.artist.mapper.response.ArtistEntityResponseMapper;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ArtistServiceTest {
    @InjectMocks
    ArtistService artistService;

    @Mock
    ArtistRepository artistRepository;

    @Test
    void whenFindArtistByIdReturnOptionalOfArtistEntity() {

        ArtistEntity artistEntity = ArtistEntity.builder()
                .name("Eminem")
                .id("13")
                .link("https://www.deezer.com/artist/13")
                .share("https://www.deezer.com/artist/13?utm_source=deezer&utm_content=artist-13&utm_term=0_1651495407&utm_medium=web")
                .picture("https://api.deezer.com/artist/13/image")
                .nbAlbum(54)
                .nbFan(15307427)
                .tracklist("https://api.deezer.com/artist/13/top?limit=50")
                .type("artist")
                .build();

        Optional<ArtistEntity> expected = Optional.ofNullable(artistEntity);

        Mockito.when(artistService.findArtistById("13"))
                .thenReturn(expected);

        Optional<ArtistEntity> actual = artistService.findArtistById("13");
        assertEquals(expected, actual);
    } //TODO mockserver

    @Test
    void deleteArtist() {
        artistRepository.deleteById("13");

        Mockito.verify(this.artistRepository,Mockito.atMostOnce()).deleteById("13");
    }
}