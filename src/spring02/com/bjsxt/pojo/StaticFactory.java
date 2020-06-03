package spring02.com.bjsxt.pojo;

/**
 * 静态工厂
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class StaticFactory {
    public static People newInstance() {
        return new People(2000000, "静态工厂测试");
    }
}
