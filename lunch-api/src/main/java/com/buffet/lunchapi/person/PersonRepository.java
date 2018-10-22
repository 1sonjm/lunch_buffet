package com.buffet.lunchapi.person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {

    @RestResource(exported = false)
    @Override
    public void deleteAll(Iterable<? extends Person> entities);

    @RestResource(exported = false)
    @Override
    public void deleteAll();
}