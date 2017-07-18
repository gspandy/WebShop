package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.taotao.service.ItemParamItemService;

/**
 * 展示商品规格参数展示
 * @author Administrator
 * 2016年9月12日
 * ItemParamItemController.java
 */
@Controller
public class ItemParamItemController {
	@Autowired
	private ItemParamItemService itemParamItemService;
	
	@RequestMapping("/showitem/{itemId}")
	public String showItemParam(@PathVariable Long itemId, Model model) {
		String string = itemParamItemService.getItemParamById(itemId);
		model.addAttribute("itemParam", string);
		return "item";
	}
	
	

	
}
