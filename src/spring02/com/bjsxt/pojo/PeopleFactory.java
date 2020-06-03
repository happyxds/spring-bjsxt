package spring02.com.bjsxt.pojo;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class PeopleFactory {

    public People createPeople(String $switch) {
        switch ($switch) {
            case "A":
                return new A(11,"测试A");
            case "B":
                return new B(22,"测试B");
            default:
                return null;
        }
    }

    //无参方法
    public People createPeople() {
        return new A();
    }
}
