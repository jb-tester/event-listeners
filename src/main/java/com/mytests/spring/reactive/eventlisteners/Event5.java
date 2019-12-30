package com.mytests.spring.reactive.eventlisteners;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/30/2019.
 * Project: event-listeners
 * *******************************
 */
public class Event5 {
    private final String s;

    public Event5(final String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Event5: " +
                "s='" + s + '\'' +
                ' ';
    }
}
