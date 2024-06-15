package facade_pattern;

public class MoneyChecker {
    int currentMoney=1000;

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void depositMoney(int money) {
        currentMoney+=money;
        System.out.println("Moeny in account is "+currentMoney);
    }

    public boolean checkMoney(int money) {
        return currentMoney>=money;
    }

    public void withdrawMoney(int money) {
        if (checkMoney(money)) {
            currentMoney-=money;
        } else {
            System.out.println("Transaction failer");
        }
        System.out.println("Moeny in account is "+currentMoney);
    }
}
