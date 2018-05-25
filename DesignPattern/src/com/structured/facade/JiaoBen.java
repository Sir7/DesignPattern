package com.structured.facade;

/** 
 * @Title: JiaoBen
 * @Description: 脚本
 * @author yang.lvsen
 * @date 2018年5月25日 下午5:15:38
 */
public class JiaoBen {

	public A a;
	public Q q;
	public E e;
	public R r;
	public ShanXian shanXian;
	public JiuTou jiuTou;
	public LeftClick leftClick;
	public Space space;

	public JiaoBen() {
        a = new A();
        e = new E();
        jiuTou = new JiuTou();
        leftClick = new LeftClick();
        q = new Q();
        r = new R();
        shanXian = new ShanXian();
        space = new Space();
    }

	//瑞雯
	public String RW() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.q()).append(" + ");
        sb.append(space.space()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(leftClick.leftClick()).append(" + ");
        sb.append(q.q()).append(" + ");
        sb.append(space.space()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(leftClick.leftClick()).append(" + ");
        sb.append(q.q()).append(" + ");
        sb.append(space.space()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(leftClick.leftClick()).append("\n");
        return sb.toString();
    }

	//盲僧
	public String MS() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.q()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(e.e()).append(" + ");
        sb.append(jiuTou.jiutou()).append(" + ");
        sb.append(r.r()).append(" + ");
        sb.append(a.a()).append(" + ");
        sb.append(shanXian.shanxian()).append(" + ");
        sb.append(q.q()).append("\n");
        return sb.toString();
    }
	
}
