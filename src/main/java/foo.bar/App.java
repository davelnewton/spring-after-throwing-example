package foo.bar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        ThrowingClass tc = (ThrowingClass) ctx.getBean("tc");
        try {
            tc.foo();
        } catch (AnException e) {
            e.printStackTrace();
        } catch (AnotherException e) {
            e.printStackTrace();
        }
    }

}
