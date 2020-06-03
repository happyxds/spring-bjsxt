package spring01.com.bjsxt.pojo;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class People {

    private int id;
    private String name;

    public People() {
        System.out.println("默认：执行[无参]构造方法");
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
