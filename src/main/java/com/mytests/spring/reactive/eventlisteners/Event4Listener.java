package com.mytests.spring.reactive.eventlisteners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/30/2019.
 * Project: event-listeners
 * *******************************
 */
@Component
public class Event4Listener {

    private final List<Event5> event5s = new ArrayList<>();

    @EventListener//(Event4.class)
    public Flux<Event5> handleEvent4(Event4 event4) {
        event5s.add(new Event5("event5 from " + event4.getS()));
        System.out.println(event4.getS());

        return Flux.fromIterable(event5s);
    }

}
