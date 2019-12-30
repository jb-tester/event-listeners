package com.mytests.spring.reactive.eventlisteners;

import org.springframework.context.event.EventListener;

public class AnotherListenerBean {

        @EventListener
        public void handleContextEvent (MyAnotherEvent myEvent) {
            System.out.println("event received: " + myEvent);
        }
    }
