package org.example.Homework.hw15.products.ultrabooks;

import org.example.Homework.hw15.behavior.Touchscreen;

public class DellXps13 extends Ultrabook implements Touchscreen {

    public DellXps13() {
        super("Dell XPS 13", 1300, 2, 16);
    }

    @Override
    public void touch() {
        System.out.println(getName() + ": tap, swipe, pinch to zoom");
    }
}
