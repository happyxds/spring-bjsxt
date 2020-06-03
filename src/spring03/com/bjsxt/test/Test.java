package spring03.com.bjsxt.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring03.com.bjsxt.pojo.People;

/**
 * Created by Daniel(Dasi Xie) on 6/1/2020.
 */
public class Test {

    public static void main(String[] args) {


        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring03/applicationContext-03.xml");
        People people = ac.getBean("peo3", People.class);
        System.out.println(people);

/*
        // 工厂模式创建方式
        PeopleFactory factory = new PeopleFactory();
        People peopleA = factory.createPeople("A");
        People peopleB = factory.createPeople("B");
        People peopleE = factory.createPeople();
*/

/*
        //实例工厂
//        InstanceFactory pf = new InstanceFactory();
//        People peo21 = pf.newInstance();

        //spring 配置调用方式
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring03/applicationContext-03.xml");
        People peo21 = ac.getBean("peo21",People.class);

        //打印输出结果
        System.out.println(peo21);
*/

/*
        //静态工厂
//        People peo22 = StaticFactory.newInstance();

        //spring 调用方式
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring03/applicationContext-03.xml");
        People peo22 = ac.getBean("peo22",People.class);

        //打印输出结果
        System.out.println(peo22);
*/

    }
}
