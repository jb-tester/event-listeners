package com.mytests.spring.reactive.eventlisteners;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/30/2019.
 * Project: event-listeners
 * *******************************
 */
public class Event3 {
    public Event3(int count) {
        this.count = count;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
