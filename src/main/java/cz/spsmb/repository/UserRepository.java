package cz.spsmb.repository;

import cz.spsmb.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    // "SELECT * FROM username WHERE name = "petr"; "

    User findByName(String name);
}
