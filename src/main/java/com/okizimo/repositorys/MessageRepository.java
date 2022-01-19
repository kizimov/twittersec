package com.okizimo.repositorys;

import com.okizimo.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
//    allows you to find the full list of fields or find them by....
//    the rules for creating methods are described in the Spring JPA manual
//    https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
    List<Message> findByTag(String tag);

}
