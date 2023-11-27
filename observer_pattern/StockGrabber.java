package observer_pattern;

import java.util.*;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int index = observers.indexOf(deleteObserver);
        System.out.println("Observer "+(index+1)+" is deleted");
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setaaplPrice(double newaaplPrice) {
        this.aaplPrice = newaaplPrice;
        notifyObserver();
    }

    public void setgoogPrice(double newgoogPrice) {
        this.googPrice = newgoogPrice;
        notifyObserver();
    }

}
