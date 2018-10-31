package com.nbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nbs.pojo.Item;
import com.nbs.service.ItemService;



@RestController
public class ItemController {
	
	
	@Autowired
	private ItemService itemService;
	
	//@RequestMapping(value="/item/{id}", method=RequestMethod.GET)
	@GetMapping(value="/item/{id}")
	public Item queryItemById(@PathVariable(name = "id") Long id) {
		return this.itemService.queryItemById(id);
	}
	

}
