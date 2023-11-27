package observer_pattern;

import java.text.*;

public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        stock = newStock;
        price = newPrice;
    }

    @Override
    public void run() {
        for(int i=0;i<=20;i++) {
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {}
            double randNum = (Math.random()*(0.6))-0.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format((price+randNum)));
            if(stock == "IBM") ((StockGrabber)stockGrabber).setIBMPrice(randNum);
            if(stock == "AAPL") ((StockGrabber)stockGrabber).setaaplPrice(randNum);
            if(stock == "GOOG") ((StockGrabber)stockGrabber).setgoogPrice(randNum);
            System.out.println(stock+" : "+df.format((price+randNum))+" "+df.format(randNum));
        }
    }

}
