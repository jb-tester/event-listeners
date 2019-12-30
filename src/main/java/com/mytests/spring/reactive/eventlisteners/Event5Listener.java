package com.mytests.spring.reactive.eventlisteners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/30/2019.
 * Project: event-listeners
 * *******************************
 */
@Component
public class Event5Listener {

    @EventListener(Event5.class)
    public void handleEvent5(Event5 event5) {
        System.out.println(event5.toString());
    }
}
