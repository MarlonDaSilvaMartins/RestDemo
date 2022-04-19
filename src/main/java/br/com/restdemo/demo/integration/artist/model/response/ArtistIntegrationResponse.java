package br.com.restdemo.demo.integration.artist.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ArtistIntegrationResponse {
    public String id;
    public String name;
    public String link;
    public String share;
    public String picture;
    public String picture_small;
    public String picture_medium;
    public String picture_big;
    public String picture_xl;
    public int nb_album;
    public int nb_fan;
    public boolean radio;
    public String tracklist;
    public String type;
}
