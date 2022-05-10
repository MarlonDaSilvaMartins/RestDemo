package br.com.restdemo.demo.service.artist.facade;

import br.com.restdemo.demo.configuration.exceptions.DataNotFoundException;
import br.com.restdemo.demo.service.artist.ArtistService;
import br.com.restdemo.demo.service.artist.ArtistServiceFacade;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import static br.com.restdemo.demo.service.artist.facade.ArtistFacadeStub.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = {ArtistServiceFacade.class, ArtistService.class})
class ArtistServiceFacadeTest {
    @InjectMocks
    ArtistServiceFacade artistServiceFacade;

    @Mock
    ArtistService artistService;

    @Test
    void findArtistById() {
        var expected = artistServiceResponseExpectedStub();
        var findByIdResponse = artistEntityOptionalStub();

        Mockito.when(artistService.findArtistById("13"))
                .thenReturn(findByIdResponse);

        var actual = artistServiceFacade.findArtist("13");
        assertEquals(expected, actual);

    }

    @Test
    void findArtistByIntegration() {
        var expected = artistServiceResponseExpectedStub();
        var serviceResponse = artistServiceResponseStub();

        Mockito.when(artistService.findArtistIntegration("13"))
                .thenReturn(serviceResponse);

        var actual = artistServiceFacade.findArtist("13");
        assertEquals(expected, actual);

    }

//    @Test
//    void whenNotFindArtistIntegrationReturnBadRequest() {
//        ArtistServiceResponse artistServiceResponse = artistServiceNotFoundStub();
//
//        Mockito.when(artistService.findArtistIntegration("13r")).thenReturn(artistServiceResponse);
//
//
//        Exception exception = assertThrows(
//                DataNotFoundException.class, () -> artistServiceFacade.findArtist("13r"));
//
//        var expected = "id";
//
//        var actual = exception.getMessage();
//
//        assertEquals(actual, expected);
//    }

    @Test
    void deleteArtist() {
        Mockito.doNothing().when(artistService).deleteArtist("13");

        artistServiceFacade.deleteArtist("13");

        var actual = Mockito.verify(this.artistService, Mockito.atMostOnce()).findArtistById("13");

        assertNull(actual);
    }
}