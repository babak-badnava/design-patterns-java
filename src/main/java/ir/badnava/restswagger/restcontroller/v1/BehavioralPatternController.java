package ir.badnava.restswagger.restcontroller.v1;

import io.swagger.annotations.ApiOperation;
import ir.badnava.restswagger.models.Animal;
import ir.badnava.restswagger.models.Bird;
import ir.badnava.restswagger.models.Dog;
import ir.badnava.restswagger.patterns.behavioral.observer.StockGrabber;
import ir.badnava.restswagger.patterns.behavioral.observer.StockObserver;
import ir.badnava.restswagger.patterns.behavioral.strategy.ItFlys;
import ir.badnava.restswagger.responsebodymodels.MessageResponseBody;
import ir.badnava.restswagger.responsebodymodels.RestResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/behavioral")
public class BehavioralPatternController<T extends RestResponseBody> extends V1RestController {


    @ApiOperation(value = "Strategy Design pattern", response = RestResponseBody.class)
    @RequestMapping(value = "/strategy", method = RequestMethod.POST)
    public MessageResponseBody strategy() {

        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog: " + dog.tryToFly());
        System.out.println("Bird: " + bird.tryToFly());

        dog.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + dog.tryToFly());

        return new MessageResponseBody("Strategy Test");
    }

    @ApiOperation(value = "Strategy Design pattern", response = RestResponseBody.class)
    @RequestMapping(value = "/observer", method = RequestMethod.POST)
    public MessageResponseBody observer() {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.setApplePrice(123.12);
        stockGrabber.setGooglePrice(120.12);
        stockGrabber.setIbmPrice(100.12);

        stockGrabber.unRegister(stockObserver1);

        stockGrabber.setIbmPrice(111.12);


        return new MessageResponseBody("Observer Test");
    }

}
