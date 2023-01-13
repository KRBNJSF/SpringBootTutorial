package cz.spsmb.repository;

import cz.spsmb.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
    // "SELECT * FROM item WHERE name = "apple"; "
    Item findByNameAnd(String name);
}
