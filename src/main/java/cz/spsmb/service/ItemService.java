package cz.spsmb.service;

import cz.spsmb.entity.Item;

import java.util.List;

public interface ItemService {

    List<Item> getAll();

    void save(Item item);

    Item findItemByName(String name);


    Item getItemByName(String itemName);
}
