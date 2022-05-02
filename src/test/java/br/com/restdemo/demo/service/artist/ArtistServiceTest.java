package br.com.restdemo.demo.service.artist;

import br.com.restdemo.demo.integration.artist.ArtistIntegration;
import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import br.com.restdemo.demo.model.artist.ArtistEntity;
import br.com.restdemo.demo.repository.artist.ArtistRepository;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ArtistServiceTest {
    @InjectMocks
    ArtistService artistService;

    @Mock
    ArtistRepository artistRepository;

//    @Mock
//    ArtistIntegration artistIntegration;

    @Test
    void whenFindArtistResturnArtist() {

//        ArtistIntegrationResponse artistIntegrationResponse = ArtistIntegrationResponse.builder()
//                .name("Eminem")
//                .id("13")
//                .link("https://www.deezer.com/artist/13")
//                .share("https://www.deezer.com/artist/13?utm_source=deezer&utm_content=artist-13&utm_term=0_1651495407&utm_medium=web")
//                .picture("https://api.deezer.com/artist/13/image")
//                .nbAlbum(54)
//                .nbFan(15307427)
//                .tracklist("https://api.deezer.com/artist/13/top?limit=50")
//                .type("artist")
//                .build();

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

        ArtistServiceResponse resultExpected = ArtistServiceResponse.builder()
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

//        Mockito.when(artistIntegration.findArtist("13"))
//                .thenReturn(artistIntegrationResponse);
        Mockito.when(artistRepository.findById("13"))
                .thenReturn(Optional.ofNullable(artistEntity));

        ArtistServiceResponse artistServiceResponse = artistService.findArtist("13");
        assertEquals(resultExpected, artistServiceResponse);
    }


//    @Test
//    void deleteArtist() {
//    }
}