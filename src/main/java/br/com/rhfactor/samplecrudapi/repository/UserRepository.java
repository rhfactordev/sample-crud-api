package br.com.rhfactor.samplecrudapi.repository;

import br.com.rhfactor.samplecrudapi.domains.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    // CREATE, READ, DELETE, UPDATE
}


