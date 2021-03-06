package br.com.restdemo.demo.controller.artist.v1.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ArtistControllerResponse {
    private String name;
    private String id;
    private String link;
    private String share;
    private String picture;
    private Integer nbAlbum;
    private Integer nbFan;
    private String tracklist;
    private String type;
}
