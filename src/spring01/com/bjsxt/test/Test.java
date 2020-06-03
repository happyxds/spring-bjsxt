package spring01.com.bjsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring01.com.bjsxt.pojo.People;

import java.util.Arrays;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class Test {

    public static void main(String[] args) {
        // 1.spring出现前的写法
//        People peo = new People();

        // 2.spring获取对象方式--配置Bean见applicationContext-01.xml
        // 默认配置文件被加载时，创建及初始化对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring01/applicationContext-01.xml");
//         getBean("<bean>标签id值",返回值类型);如果没有第二个参数，默认Object
        People people = ac.getBean("peo1",People.class);
        System.out.println(people);
        // 作用：解耦

        // 3.当前spring容器中所有被管理的对象集合
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        // 4.stream循环输出
        Arrays.stream(beanDefinitionNames).forEach(item -> System.out.println(item));
    }
}
