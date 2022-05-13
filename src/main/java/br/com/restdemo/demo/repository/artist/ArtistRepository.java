package br.com.restdemo.demo.repository.artist;

import br.com.restdemo.demo.model.artist.ArtistEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends MongoRepository<ArtistEntity, String> {
}
