package ir.badnava.restswagger.patterns.creational.abstractfactory;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngin() {
        return new ESUFOBossEngine();
    }
}
