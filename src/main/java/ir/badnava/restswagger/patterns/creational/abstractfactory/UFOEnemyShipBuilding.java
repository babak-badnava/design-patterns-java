package ir.badnava.restswagger.patterns.creational.abstractfactory;

import ir.badnava.restswagger.patterns.creational.factory.BigUFOEnemyShip;
import ir.badnava.restswagger.patterns.creational.factory.EnemyShip;
import ir.badnava.restswagger.patterns.creational.factory.UFOEnemyShip;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        EnemyShipFactory enemyShipFactory;
        if (typeOfShip.equals("UFO")) {
            enemyShipFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(enemyShipFactory);
            theEnemyShip.setName("UFO Grunt Ship");

        } else if (typeOfShip.equals("UFO BOSS")) {
            enemyShipFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new BigUFOEnemyShip(enemyShipFactory);
            theEnemyShip.setName("UFO BOSS Ship");
        }

        return theEnemyShip;
    }
}
