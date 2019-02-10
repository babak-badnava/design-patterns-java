package ir.badnava.restswagger.patterns.creational.abstractfactory;

public class UFOEnemyShipFactory implements EnemyShipFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngin() {
        return new ESUFOEngine();
    }
}
