package facade_pattern;

// The Facade Pattern provides a unified interface to a set of interfaces in a subsystem.

public class Main {
    public static void main(String[] args) {
        BankFacade bankFacade=new BankFacade(12345, 123);
        bankFacade.depositMoney(100);
        bankFacade.withdrawMoney(300);
        bankFacade.withdrawMoney(100000);
    }
}
