package ir.badnava.restswagger.patterns.behavioral.strategy;

public class ItFlys implements Flys {
    @Override
    public String fly() {
        return "It is flaying high.";
    }
}
