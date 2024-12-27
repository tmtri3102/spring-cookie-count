package com.springcookiecount.model;

public class Counter {
    private int count;

    public void increment() {
        count++;
    }

    public Counter() {
    }

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
