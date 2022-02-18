package br.com.restdemo.demo.controller;

import br.com.restdemo.demo.model.Artista;
import br.com.restdemo.demo.service.DeezerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeezerController {
    @Autowired
    DeezerService deezerService;

    @GetMapping("/v1/artista/{artistaId}")
    public ResponseEntity<Artista> pegarArtista(@PathVariable("artistaId") String artistaId){
        return deezerService.getArtistaById(artistaId);
    }
}