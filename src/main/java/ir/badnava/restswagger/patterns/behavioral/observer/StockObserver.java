package ir.badnava.restswagger.patterns.behavioral.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIdTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIdTracker;
        System.out.println("New Observer have been added. \nObserver ID: " + observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

        System.out.println("observerId: " + observerID + "\nIBM price: " + ibmPrice
                + "\nApple price: " + applePrice
                + "\nGoogle price: " + googlePrice);
    }
}
