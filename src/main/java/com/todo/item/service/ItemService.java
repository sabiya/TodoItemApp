package com.todo.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.item.Item;
import com.todo.item.ItemDAO;

/**
 * @author sabiya
 *
 */
public class ItemService {

	@Autowired
	private ItemDAO itemDAO;
	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

	public List<Item> getItems() {
		return itemDAO.getItems();
	}

	public Item addItem(Item item) {
		return itemDAO.addItem(item);
	}

	public Item editItem(Item item) {
		// TODO Auto-generated method stub
		return itemDAO.editItem(item);
	}

}
