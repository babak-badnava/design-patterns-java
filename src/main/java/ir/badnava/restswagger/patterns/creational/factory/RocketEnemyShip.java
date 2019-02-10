package ir.badnava.restswagger.patterns.creational.factory;

public class RocketEnemyShip extends EnemyShip {

    public RocketEnemyShip() {
        setName("Rocket Enemy Ship");
        setAmtDamage(10.0);
    }

    @Override
    public void makeShip() {

    }
}
