package ru.easyjava.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application main class.
 */
public final class App {
    /**
     * Do not construct me.
     */
    private App() { };

    /**
     * Application entry point.
     * @param args Array of command line arguments.
     */
    public static void main(final String[] args) {
        ApplicationContext context =
          new ClassPathXmlApplicationContext("/applicationContext.xml");
        Greeter greeter = context.getBean(Greeter.class);

        System.out.println(greeter.greet());
    }
}
