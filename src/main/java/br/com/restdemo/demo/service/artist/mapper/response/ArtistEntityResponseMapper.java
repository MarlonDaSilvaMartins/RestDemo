package br.com.restdemo.demo.service.artist.mapper.response;

import br.com.restdemo.demo.model.artist.ArtistEntity;
import br.com.restdemo.demo.service.artist.model.response.ArtistServiceResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ArtistEntityResponseMapper {

    public static ArtistServiceResponse toArtistEntity(ArtistEntity artistEntity){
        return ArtistServiceResponse.builder()
                .id(artistEntity.getId())
                .name(artistEntity.getName())
                .link(artistEntity.getLink())
                .share(artistEntity.getShare())
                .picture(artistEntity.getPicture())
                .nb_album(artistEntity.getNb_album())
                .nb_fan(artistEntity.getNb_fan())
                .tracklist(artistEntity.getTracklist())
                .type(artistEntity.getType())
                .build();
    }

}
