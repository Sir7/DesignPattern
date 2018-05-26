package com.behavior.template_method;

/** 
 * @Title: Tea 
 * @Description: 模板方法类
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:53:50 
 *  
 */
public abstract class Tea {
	
	protected void 加奶() {
        System.out.println("加入三花淡奶");
    }

    protected abstract void 加茶();

    protected abstract void 加料();

    protected  void 打包() {
        System.out.println("用打包机打包");
    }

    /*
     * 钩子是一种被声明在抽象类的方法，可以为空或者默认的实现。钩子的存在可以让子类有能力对算法的不同点进行挂钩，是否需要挂钩由子类决定。
     * 比如这里通过一个标记确定是否需要打包，子类中可以定义一个方法来调用这个方法，我们在椰果绿茶里重写这个钩子方法。
     */
    //钩子方法
    protected boolean 是否打包() {
        return true;
    }

    public final void make() {
        System.out.println("=== 开始制作 ===");
        加奶();
        加茶();
        加料();
        if(是否打包()) {
        	打包();
        }
        System.out.println("=== 制作完毕 ===");
    }

}
