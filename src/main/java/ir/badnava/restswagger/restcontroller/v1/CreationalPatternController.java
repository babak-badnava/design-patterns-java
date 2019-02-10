package ir.badnava.restswagger.restcontroller.v1;

import io.swagger.annotations.ApiOperation;
import ir.badnava.restswagger.patterns.creational.Singleton;
import ir.badnava.restswagger.patterns.creational.abstractfactory.EnemyShipBuilding;
import ir.badnava.restswagger.patterns.creational.abstractfactory.UFOEnemyShipBuilding;
import ir.badnava.restswagger.patterns.creational.factory.EnemyShip;
import ir.badnava.restswagger.patterns.creational.factory.EnemyShipFactory;
import ir.badnava.restswagger.responsebodymodels.MessageResponseBody;
import ir.badnava.restswagger.responsebodymodels.RestResponseBody;
import ir.badnava.restswagger.responsebodymodels.TestResponseBody;
import ir.badnava.restswagger.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/creational")
public class CreationalPatternController<T extends RestResponseBody> extends V1RestController {


    @ApiOperation(value = "Singleton Design pattern", response = RestResponseBody.class)
    @RequestMapping(value = "/singleton", method = RequestMethod.POST)
    public MessageResponseBody singleton(@RequestParam() String name) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                singleton.setId(0);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                singleton.setId(1);
            }
        });

        t1.start();
        t2.start();

        System.out.println("Singleton test completed");
        return new MessageResponseBody("Singleton Test");
    }

    @ApiOperation(value = "Factory Design pattern", response = RestResponseBody.class)
    @RequestMapping(value = "/factory", method = RequestMethod.POST)
    public MessageResponseBody factory() {

        String[] enemyTypes = new String[]{"R", "U", "B", "U"};
        for (String type : enemyTypes) {
            EnemyShip ship = EnemyShipFactory.makeEnemyShip(type);
            doSomeStuff(ship);
        }

        return new MessageResponseBody("Singleton Test");
    }

    @ApiOperation(value = "Factory Design pattern", response = RestResponseBody.class)
    @RequestMapping(value = "/absfactory", method = RequestMethod.POST)
    public MessageResponseBody absfactory() {

        EnemyShipBuilding building = new UFOEnemyShipBuilding();

        String[] enemyTypes = new String[]{"UFO", "UFO BOSS"};
        for (String type : enemyTypes) {
            EnemyShip enemyShip = building.orderTheShip(type);
            System.out.println(enemyShip + "\n");
        }

        return new MessageResponseBody("Singleton Test");
    }

    private void doSomeStuff(EnemyShip ship) {
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();

    }

}
