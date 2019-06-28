package com.stackroute.MuzixApplication.repository;

import com.stackroute.MuzixApplication.document.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost:4200")
public interface MuzixRepository extends MongoRepository<Track, String> {

}
