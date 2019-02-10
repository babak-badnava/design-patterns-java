package ir.badnava.restswagger.patterns.creational.factory;

import ir.badnava.restswagger.patterns.creational.abstractfactory.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {

    EnemyShipFactory enemyShipFactory;

    public UFOEnemyShip(EnemyShipFactory factory) {
        enemyShipFactory = factory;

        setName("UFO Enemy Ship");
        setAmtDamage(20.0);
    }

    public UFOEnemyShip() {
        setName("UFO Enemy Ship");
        setAmtDamage(20.0);
    }

    @Override
    public void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = enemyShipFactory.addESGun();
        engine = enemyShipFactory.addESEngin();
    }
}
