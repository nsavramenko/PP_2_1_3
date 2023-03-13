import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // HelloWorld
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldBean1 =
                applicationContext.getBean("helloworld", HelloWorld.class);
//        System.out.println(helloWorldBean1.getMessage());
        HelloWorld helloWorldBean2 =
                applicationContext.getBean("helloworld",HelloWorld.class);

        System.out.print("Comparing of HelloWorld: " );
        System.out.println(helloWorldBean1 == helloWorldBean2);


        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.print("Comparing of Cat: " );
        System.out.println(catBean1 == catBean2);
    }
}