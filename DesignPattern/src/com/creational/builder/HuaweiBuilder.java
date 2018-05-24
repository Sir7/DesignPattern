package com.creational.builder;

/** 
 * @Title: HuaweiBuilder 
 * @Description: Builder的实现类，实现Builder类中定义方法，并返回组建好的对象
 * @author yang.lvsen
 * @date 2018年5月24日 下午8:33:33 
 *  
 */
public class HuaweiBuilder implements Builder {

	Computer computer = new Computer();

    /**
     * 产品零件建造方法1
     */
    @Override
    public void buildDisplay() {
        //构建产品的第一个零件
        computer.setDisplay("华为显示器");
    }

    /**
     * 产品零件建造方法1
     */
    @Override
    public void buildHost() {
        //构建产品的第二个零件
        computer.setHost("华为主机");
    }
    /**
     * 产品返还方法，返回一个完整的产品
     */
    @Override
    public Computer retrieveResult() {
        return computer;
    }
}
