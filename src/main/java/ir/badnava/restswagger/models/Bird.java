package ir.badnava.restswagger.models;

import ir.badnava.restswagger.patterns.behavioral.strategy.ItFlys;

public class Bird extends Animal {

    public Bird() {
        super();

        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
