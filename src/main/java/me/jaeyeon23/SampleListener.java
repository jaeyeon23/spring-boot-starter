package me.jaeyeon23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {

    @Autowired
    protected JaeyeonProperties jaeyeonProperties;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("============================");
        System.out.println(jaeyeonProperties.getFullName());
        System.out.println("============================");
    }
}
