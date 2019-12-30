package com.mytests.spring.reactive.eventlisteners;

import org.springframework.context.event.EventListener;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public class AListenerBean {

        @EventListener
        public Mono<MyAnotherEvent> handleContextEvent (MyEvent myEvent) {
            System.out.println("event received: " + myEvent);
            return Mono.just(new MyAnotherEvent(LocalDateTime.now()));
        }
    }
