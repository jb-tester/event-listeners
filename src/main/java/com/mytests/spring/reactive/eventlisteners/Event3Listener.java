package com.mytests.spring.reactive.eventlisteners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/30/2019.
 * Project: event-listeners
 * *******************************
 */
@Component
public class Event3Listener {

     @EventListener//(Event3.class)
     public List<Event4> handleEvent3(Event3 event3){
         System.out.println("event3 with count==" + event3.count());
         List<Event4> event4s = new ArrayList<>();
         for (int i = 0; (i <= event3.count()) && (i <= 1000); i++) {
             event4s.add(new Event4("event4_" + i));
         }
         return event4s;
     }
}
