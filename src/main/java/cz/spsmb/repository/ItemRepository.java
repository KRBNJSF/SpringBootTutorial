package cz.spsmb.repository;

import cz.spsmb.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    // "SELECT * FROM item WHERE name = "apple"; "
    Item findByName(String name);
}
