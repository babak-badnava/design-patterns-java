package ir.badnava.restswagger.patterns.creational.factory;

import ir.badnava.restswagger.patterns.creational.abstractfactory.EnemyShipFactory;

public class BigUFOEnemyShip extends EnemyShip {

    EnemyShipFactory enemyShipFactory;

    public BigUFOEnemyShip() {
        setName("Big UFO Enemy Ship");
        setAmtDamage(40.0);
    }

    public BigUFOEnemyShip(EnemyShipFactory enemyShipFactory) {
        this.enemyShipFactory = enemyShipFactory;
        setName("Big UFO Enemy Ship");
        setAmtDamage(40.0);
    }

    @Override
    public void makeShip() {
        System.out.println("Making the enemy ship " + getName());

        weapon = enemyShipFactory.addESGun();
        engine = enemyShipFactory.addESEngin();
    }
}
