package cz.spsmb.controller;

import cz.spsmb.service.SimpleItemService;
import cz.spsmb.entity.Item;
import cz.spsmb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Toto je controller, ktery ma neco zpracovat behem requestu
@RestController
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(path = "/items", method = RequestMethod.GET)
    public List<Item> getAllItems() {
        return itemService.getAll();
        //Talend api tester
    }

    @RequestMapping(path = "/item", method = RequestMethod.POST)
    public void saveItem(@RequestBody Item item) {
        itemService.save(item);
    }

    @RequestMapping(path = "/item/{itemName}", method = RequestMethod.GET)
    public Item getItemByName(@PathVariable String itemName) {
        return this.itemService.getItemByName(itemName);
    }


}
