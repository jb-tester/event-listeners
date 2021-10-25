package com.mytests.spring.reactive.eventlisteners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EventListenersApplication implements CommandLineRunner {

    @Autowired
    ApplicationContext context;
    @Bean
    MyEventListenerBean listenerBean () {
        return new MyEventListenerBean();
    }

    @Bean
    public UtilsRecord utilsRecordBean() {
        return new UtilsRecord("test");
    }
    @Bean
    public UtilsClass utilsClassBean() {
        return new UtilsClass("test");
    }
    @Bean
    AnotherListenerBean anotherListenerBean () {
        return new AnotherListenerBean();
    }
    public static void main(String[] args) {
        SpringApplication.run(EventListenersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        context.publishEvent(new MyEvent("test message 1"));
        context.publishEvent(new Event3(3));
    }
}
