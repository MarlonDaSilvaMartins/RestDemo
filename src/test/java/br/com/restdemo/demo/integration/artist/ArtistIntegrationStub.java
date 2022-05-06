package br.com.restdemo.demo.integration.artist;

import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import com.google.common.net.HttpHeaders;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

public class ArtistIntegrationStub {

    public static ArtistIntegrationResponse artistIntegrationResponseExpect() {
        return ArtistIntegrationResponse.builder()
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
    }

    public static ArtistIntegrationResponse artistIntegrationResponse() {
        return ArtistIntegrationResponse.builder()
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
    }



}
