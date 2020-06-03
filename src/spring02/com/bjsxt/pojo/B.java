package spring02.com.bjsxt.pojo;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class B extends People {
    public B() {
        System.out.println("B默认：执行[无参]构造方法");
    }

    public B(int id, String name) {
        super(id, name);
        System.out.println("B执行[有参]构造方法[id,name]<int,String>");
    }
}
