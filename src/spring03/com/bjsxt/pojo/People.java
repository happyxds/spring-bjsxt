package spring03.com.bjsxt.pojo;

import java.util.Set;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class People {

    private int id;
    private String name;
    private Set<String> sets;
    private Set<Group> setsG;

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
        System.out.println("执行setId：" + id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("执行setName：" + name);
        this.name = name;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Set<Group> getSetsG() {
        return setsG;
    }

    public void setSetsG(Set<Group> setsG) {
        this.setsG = setsG;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sets=" + sets +
                ", setsG=" + setsG +
                '}';
    }
}
