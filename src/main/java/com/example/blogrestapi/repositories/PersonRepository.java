package com.example.blogrestapi.repositories;


import java.util.List;


import com.example.blogrestapi.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "posts")
public interface PersonRepository extends MongoRepository<Post, String> {

    List<Post> findByAuthor(@Param("author") String author);
    List<Post> findAllByAuthorOrderByAuthorDesc(@Param("author") String author);
    @RestResource(path = "smart-search")
    @Query("{ 'author' : { $regex: ?0, $options: 'i' } }")
    List<Post> findBySimilarAuthorOrderByAuthorAuthorDesc(String author);

}