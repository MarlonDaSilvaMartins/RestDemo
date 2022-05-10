package br.com.restdemo.demo.controller.artist.v1.controller;

import br.com.restdemo.demo.controller.artist.v1.ArtistController;
import br.com.restdemo.demo.controller.artist.v1.ArtistControllerFacade;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static br.com.restdemo.demo.controller.artist.v1.controller.ArtistControllerStub.artistControllerResponse;
import static br.com.restdemo.demo.controller.artist.v1.controller.ArtistControllerStub.artistControllerResponseExpect;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ArtistController.class)
class ArtistControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ArtistControllerFacade artistControllerFacade;

    @Test
    void whenFindArtistAndReturnArtistController() throws Exception {
        var artistControllerResponse = artistControllerResponse();
        var artistControllerExpect = artistControllerResponseExpect();

        Mockito.when(artistControllerFacade.findArtist("13"))
                .thenReturn(artistControllerResponse);

        ObjectMapper mapper = new ObjectMapper();

        var expect = mapper.writeValueAsString(artistControllerExpect);

        mvc.perform(MockMvcRequestBuilders
                        .get("http://localhost:8080/v1/artist/13"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json(expect));
    }

    @Test
    void whenDeleteArtistReturnNothing() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                        .delete("http://localhost:8080/v1/artist/13"))
                .andExpect(status().isNoContent());
    }//TODO isso aqui ta certo??
}