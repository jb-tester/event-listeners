package com.mytests.spring.reactive.eventlisteners;

/**
 * *
 * <p>Created by irina on 10/25/2021.</p>
 * <p>Project: event-listeners</p>
 * *
 */
public class MyClassEvent {
    String message;

    public MyClassEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
