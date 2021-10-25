package com.mytests.spring.reactive.eventlisteners;

import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.boot.actuate.audit.listener.AuditApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by irina on 12/30/2019.
 * Project: event-listeners
 * *******************************
 */
@Component
public class ListenAll {

    @EventListener({MyEvent.class, Event4.class, Event5.class})
    public void handleAll() {
        System.out.println("some event received");
    }
}
