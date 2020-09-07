package com.example.demo.libraryapis.publisher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//<PublisherEntiry, Integer> --> <"entity mapped to DB", "type of its primary key"> 
@Repository
public interface PublisherRepository extends CrudRepository<PublisherEntity, Integer> {
}	
