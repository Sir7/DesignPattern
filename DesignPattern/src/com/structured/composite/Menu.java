package com.structured.composite;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: FishBall
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:26:55
 */
public class Menu extends AbstractMenu{

	private String name;
	private String desc;
	private List<AbstractMenu> menus = new ArrayList<>();
	
	public Menu(String name,String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	
	@Override
	public void add(AbstractMenu am) {
		menus.add(am);
	}

	@Override
	public AbstractMenu get(int index) {
		return menus.get(index);
	}

	@Override
	public String getString() {
		StringBuffer sb = new StringBuffer("\n[菜单]："+name+"信息："+desc+"\n");
		for(AbstractMenu menu:menus){
			sb.append(menu.getString()).append("\n");
		}
		return sb.toString();
	}

}
