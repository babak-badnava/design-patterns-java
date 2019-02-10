package ir.badnava.restswagger.patterns.creational.abstractfactory;

import ir.badnava.restswagger.patterns.creational.factory.EnemyShip;

public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip enemyShip = makeEnemyShip(typeOfShip);

        enemyShip.makeShip();
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShipAbs();
        enemyShip.enemyShipShootsAbs();

        return enemyShip;
    }
}
