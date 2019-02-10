package ir.badnava.restswagger.patterns.creational.factory;

public class EnemyShipFactory {

    public static EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip enemyShip = null;

        if (newShipType.equals("R")) {
            enemyShip = new RocketEnemyShip();
        } else if (newShipType.equals("U")) {
            enemyShip = new UFOEnemyShip();
        } else if (newShipType.equals("B")) {
            enemyShip = new BigUFOEnemyShip();
        } else {
            enemyShip = null;
        }

        return enemyShip;
    }
}
