package com.creational.builder;

/** 
 * @Title: Director 
 * @Description: 统一组装过程(现实开发中，一般被省略，直接使用一个Builder来进行对象的组装)
 * @author yang.lvsen
 * @date 2018年5月24日 下午8:34:18 
 *  
 */
public class Director {
	/**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;
    /**
     * 构造方法，传入建造器对象
     * @param builder 建造器对象
     */
    public Director(Builder builder){
        this.builder = builder;
    }
    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct(){
        builder.buildHost();
        builder.buildDisplay();
    }

}
