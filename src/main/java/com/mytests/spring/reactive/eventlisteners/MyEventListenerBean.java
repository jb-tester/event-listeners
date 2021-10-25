package com.mytests.spring.reactive.eventlisteners;

import org.springframework.context.event.EventListener;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public class MyEventListenerBean {

    @EventListener(condition = "#myEvent.message().contains(@utilsRecordBean.pattern())")
    public Mono<MyAnotherEvent> handleMyEvent(MyEvent myEvent) {
        System.out.println("event received: " + myEvent);
        return Mono.just(new MyAnotherEvent(LocalDateTime.now()));
    }

    @EventListener(condition = "#myEvent.message().contains(@utilsClassBean.pattern())")
    public Mono<MyAnotherEvent> handleMyClassEvent(MyClassEvent myEvent) {
        System.out.println("event received: " + myEvent);
        return Mono.just(new MyAnotherEvent(LocalDateTime.now()));
    }
}
