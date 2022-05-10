package br.com.restdemo.demo.controller.artist.v1.facade;

import br.com.restdemo.demo.controller.artist.v1.model.response.ArtistControllerResponse;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;

public class ArtistControllerfacadeStub {
    public static ArtistControllerResponse artistControllerResponseExpectedStub(){
        return ArtistControllerResponse.builder()
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

    public static ArtistServiceResponse artistControllerResponseStub(){
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
}
