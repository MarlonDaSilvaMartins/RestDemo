package br.com.restdemo.demo.model.artist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document
public class ArtistEntity {
    @Id
    private String id;
    private String name;
    private String link;
    private String share;
    private String picture;
    private Integer nb_album;
    private Integer nb_fan;
    private String tracklist;
    private String type;
}
