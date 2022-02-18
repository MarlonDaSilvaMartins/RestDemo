package br.com.restdemo.demo.service;

import br.com.restdemo.demo.model.Artista;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeezerService {
    RestTemplate restTemplate;
    String url = "https://api.deezer.com/";

    public ResponseEntity<Artista> getArtistaById(String id){
        String uri = url+"artista/"+id;
        return restTemplate.getForEntity(uri, Artista.class);
    }


    /*
    @Service
    public String pegarCep(String cep){
        String uri = "https://viacep.com.br/ws/"+cep+"/json/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }

    public String descobrirCep(String estado, String cidade, String rua){
        String uri = "https://viacep.com.br/ws/"+estado+"/"+cidade+"/"+rua+"/json";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
    */

}
