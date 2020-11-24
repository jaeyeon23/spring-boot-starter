package me.jaeyeon23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);

        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new SampleListener());
        /*app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("======================");
                out.println("code Banner");
                out.println("======================");
            }
        });*/
        app.run(args);

        /*new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);*/
    }
}
