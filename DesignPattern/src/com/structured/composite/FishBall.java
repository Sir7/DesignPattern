package com.structured.composite;

/** 
 * @Title: FishBall
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:26:55
 */
public class FishBall extends AbstractMenu{

	private String name;
	private String desc;
	private int price;
	
	public FishBall(String name,String desc,int price) {
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	
	@Override
	public void add(AbstractMenu am) {
	}

	@Override
	public AbstractMenu get(int index) {
		return null;
	}

	@Override
	public String getString() {
		return "-【鱼蛋】"+name+"标注："+desc+"价格："+price;
	}

}
