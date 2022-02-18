package br.com.restdemo.demo.controller;

import br.com.restdemo.demo.model.Artista;

public class ArtistaMapper {
    public  static Artista requestToArtista(ArtistaRequest artistaRequest){//usar esse bilingue assim ou deixar tudo em ingles??????
        return Artista.builder()
                .nome(artistaRequest.getNome())
                .link(artistaRequest.getLink())
                .build();
    }

    public static ArtistaResponse artistaToResponse(Artista artista){
        return ArtistaResponse.builder()
                .artistaId(artista.getArtistaId())
                .nome(artista.getNome())
                .link(artista.getLink())
                .build();
    }
}
