//package br.com.restdemo.demo.controller.artist.v1.controller;
//
//import br.com.restdemo.demo.controller.artist.v1.ArtistController;
//import br.com.restdemo.demo.controller.artist.v1.ArtistControllerFacade;
//import br.com.restdemo.demo.integration.artist.ArtistIntegration;
//import br.com.restdemo.demo.repository.artist.ArtistRepository;
//import br.com.restdemo.demo.service.artist.ArtistService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static br.com.restdemo.demo.controller.artist.v1.controller.ArtistControllerStub.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(ArtistController.class)
//@DataMongoTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@ContextConfiguration(classes = {ArtistController.class, ArtistRepository.class})
//public class MongoEmbeddedTest {
//    @Autowired
//    private MockMvc mvc;
//
//    @Autowired
//    private ArtistRepository artistRepository;
//
//    @BeforeAll
//    public void setup(){
//        var entity = artistEntityStub();
//        artistRepository.save(entity);
//    }
//
//    @Test
//    void whenFindArtistAndReturnArtistController() throws Exception {
//        var expect = artistEntityExpect();
//        mvc.perform(MockMvcRequestBuilders
//                        .get("http://localhost:8080/v1/artist/13"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(content().json(expect.toString()));
//    }
//
//    @Test
//    void whenDeleteArtistReturnNothing() throws Exception {
//
//        mvc.perform(MockMvcRequestBuilders
//                        .delete("http://localhost:8080/v1/artist/13"))
//                .andExpect(status().isNoContent());
//    }
//}
