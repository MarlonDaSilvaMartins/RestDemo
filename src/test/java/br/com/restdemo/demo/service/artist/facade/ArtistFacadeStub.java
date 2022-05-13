package br.com.restdemo.demo.service.artist.facade;

import br.com.restdemo.demo.model.artist.ArtistEntity;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;

import java.util.Optional;

public class ArtistFacadeStub {
    public static ArtistServiceResponse artistServiceResponseExpectedStub(){
        return ArtistServiceResponse.builder()
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

    public static ArtistServiceResponse artistServiceResponseStub(){
        return ArtistServiceResponse.builder()
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

    public static Optional<ArtistEntity> artistEntityOptionalStub() {
        return Optional.ofNullable(ArtistEntity.builder()
                .name("Eminem")
                .id("13")
                .link("https://www.deezer.com/artist/13")
                .share("https://www.deezer.com/artist/13?utm_source=deezer&utm_content=artist-13&utm_term=0_1651495407&utm_medium=web")
                .picture("https://api.deezer.com/artist/13/image")
                .nbAlbum(54)
                .nbFan(15307427)
                .tracklist("https://api.deezer.com/artist/13/top?limit=50")
                .type("artist")
                .build());
    }

    public static ArtistServiceResponse artistServiceNotFoundStub(){
        return ArtistServiceResponse.builder()
                .name(null)
                .id(null)
                .link(null)
                .share(null)
                .picture(null)
                .nbAlbum(null)
                .nbFan(null)
                .tracklist(null)
                .type(null)
                .build();
    }
}
