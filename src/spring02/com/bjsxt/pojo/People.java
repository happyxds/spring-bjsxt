package spring02.com.bjsxt.pojo;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class People {

    private int id;
    private String name;

    public People() {
        System.out.println("默认：执行[无参]构造方法");
    }

    public People(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("执行[有参]构造方法[id,name]<int,String>");
    }

    public People(Integer id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("执行[有参]构造方法[id,name]<Integer,String>");
    }

    public People(String name, int id) {
        this.id = id;
        this.name = name;
        System.out.println("执行[有参]构造方法[name,id]<String,int>");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
