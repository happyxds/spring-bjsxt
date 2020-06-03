package spring02.com.bjsxt.pojo;

/**
 * 实例工厂
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class InstanceFactory {

    public People newInstance() {
        return new People(1000000, "实例工厂测试");
    }

}
