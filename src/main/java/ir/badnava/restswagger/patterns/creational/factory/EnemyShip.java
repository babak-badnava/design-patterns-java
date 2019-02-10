package ir.badnava.restswagger.patterns.creational.factory;

import ir.badnava.restswagger.patterns.creational.abstractfactory.ESEngine;
import ir.badnava.restswagger.patterns.creational.abstractfactory.ESWeapon;

public abstract class EnemyShip {
    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;

    //    relate to the abstract factory patternt
    protected ESWeapon weapon;
    protected ESEngine engine;

    public abstract void makeShip();

    public void followHeroShipAbs() {
        System.out.println(getName() + " is following the hero at " + engine);
    }

    public void enemyShipShootsAbs() {
        System.out.println(getName() + " attacks and does " + weapon + " to hero");
    }

    public String toString() {
        return "The " + name + " has a top spedd of " + engine + " and an attack power of " + weapon;
    }
    //    relate to the abstract factory patternt
    //    end


    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getAmtDamage() + " damage to hero");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirectionX() {
        return directionX;
    }

    public void setDirectionX(double directionX) {
        this.directionX = directionX;
    }

    public double getDirectionY() {
        return directionY;
    }

    public void setDirectionY(double directionY) {
        this.directionY = directionY;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }
}
