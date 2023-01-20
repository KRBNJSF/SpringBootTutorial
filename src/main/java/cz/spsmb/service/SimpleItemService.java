package cz.spsmb.service;

import cz.spsmb.entity.Item;
import cz.spsmb.repository.ItemRepository;
import cz.spsmb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class SimpleItemService implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public SimpleItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAll() {
        /*Iterable<Item> itemIterator = this.itemRepository.findAll();
        Iterator<Item> iterator = itemIterator.iterator();
        List<Item> list = new LinkedList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;*/
        List<Item> items = new LinkedList<>();
        for (Item item : this.itemRepository.findAll()) {
            items.add(item);
        }
        return items;
    }

    @Override
    public void save(Item item) {
        this.itemRepository.save(item);
    }

    @Override
    public Item findItemByName(String name) {
        return this.itemRepository.findByName(name);
    }

    @Override
    public Item getItemByName(String itemName) {
        return null;

    }

}
