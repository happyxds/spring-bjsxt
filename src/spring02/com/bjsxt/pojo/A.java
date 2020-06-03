package spring02.com.bjsxt.pojo;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class A extends People {
    public A() {
        System.out.println("A默认：执行[无参]构造方法");
    }

    public A(int id, String name) {
        super(id, name);
        System.out.println("A执行[有参]构造方法[id,name]<int,String>");
    }
}
