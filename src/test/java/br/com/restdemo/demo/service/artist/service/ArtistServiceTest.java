package br.com.restdemo.demo.service.artist.service;

import br.com.restdemo.demo.configuration.exceptions.DataNotFoundException;
import br.com.restdemo.demo.integration.artist.ArtistIntegration;
import br.com.restdemo.demo.integration.artist.model.response.ArtistIntegrationResponse;
import br.com.restdemo.demo.model.artist.ArtistEntity;
import br.com.restdemo.demo.repository.artist.ArtistRepository;
import br.com.restdemo.demo.service.artist.ArtistService;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

import static br.com.restdemo.demo.service.artist.service.ArtistServiceStub.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = {ArtistService.class, ArtistRepository.class, ArtistIntegration.class})
class ArtistServiceTest {
    
    @InjectMocks
    ArtistService artistService;

    @Mock
    ArtistRepository artistRepository;

    @Mock
    ArtistIntegration artistIntegration;

    @Test
    void whenFindArtistByIdReturnOptionalOfArtistEntity() {
        Optional<ArtistEntity> entityResponse = artistEntityOptionalStub();
        Optional<ArtistEntity> entityExpected = artistOptionalExpectedStub();

        Mockito.when(artistRepository.findById("13"))
                .thenReturn(entityResponse);

        var actual = artistService.findArtistById("13");
        assertEquals(entityExpected, actual);
    }

    @Test
    void whenFindArtistIntegrationReturnArtistServiceResponse() {
        ArtistServiceResponse responseExpected = artistServiceResponseExpectedStub();
        ArtistEntity entityEntity = artistEntityStub();
        ArtistIntegrationResponse integrationResponse = artistIntegrationResponseStub();

        Mockito.when(artistIntegration.findArtist("13")).thenReturn(integrationResponse);
        Mockito.when(artistRepository.save(entityEntity)).thenReturn(entityEntity);

        var actual = artistService.findArtistIntegration("13");

        assertEquals(responseExpected, actual);
    }

    @Test
    void whenNotFindArtistIntegrationReturnBadRequest() {
        ArtistIntegrationResponse integrationResponse = artistIntegrationNotFoundStub();

        Mockito.when(artistIntegration.findArtist("13r")).thenReturn(integrationResponse);


        Exception exception = assertThrows(
                DataNotFoundException.class, () -> artistService.findArtistIntegration("13r"));

        var expected = "id";

        var actual = exception.getMessage();

        assertEquals(actual, expected);
    }

    @Test
    void whenDeleteArtistReturnNothing() {
        Mockito.doNothing().when(artistRepository).deleteById("13");

        artistService.deleteArtist("13");

        var actual = Mockito.verify(this.artistRepository, Mockito.atMostOnce()).findById("13");

        assertNull(actual);
    }//TODO mongo Embedded

    //TODO consumir outro endpoint para testar erro
}