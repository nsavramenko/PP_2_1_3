import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                applicationContext1.getBean("helloworld", HelloWorld.class);
        System.out.println(bean1.getMessage());

        System.out.println(bean == bean1);


        // Cat
        ApplicationContext context1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean2 = context1.getBean("cat", Cat.class);

        ApplicationContext context2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 = context2.getBean("cat", Cat.class);

        System.out.println(bean2 == bean3);
    }
}