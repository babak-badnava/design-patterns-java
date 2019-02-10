package ir.badnava.restswagger.patterns.creational.abstractfactory;

public interface EnemyShipFactory {
    public ESWeapon addESGun();

    public ESEngine addESEngin();
}
