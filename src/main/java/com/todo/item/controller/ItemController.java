package com.todo.item.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.item.Item;
import com.todo.item.service.ItemService;


/**
 * @author sabiya
 *
 */
@RestController
public class ItemController {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	ItemService itemService;
	
	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	@RequestMapping(value="/items", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Item> getItems() {
		System.out.println("Getting Items Controller");
		return itemService.getItems();
	}
	
	@RequestMapping(value="/items", method=RequestMethod.POST, headers="Accept=application/json")
	public Item addItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}
	
	
	@RequestMapping(value="/items", method=RequestMethod.PUT, headers="Accept=application/json")
	public Item editItem(@RequestBody Item item) {
		return itemService.editItem(item);
	}
}
