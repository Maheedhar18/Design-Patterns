package facade_pattern;

public class BankFacade {
    private int accountNumber;
    private int securityCode;
    AccountCheck accountCheck;
    SecurityCodeCheck securityCodeCheck;
    MoneyChecker moneyChecker;

    public BankFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        this.accountCheck = new AccountCheck();
        this.securityCodeCheck = new SecurityCodeCheck();
        this.moneyChecker = new MoneyChecker();
    }

    public void withdrawMoney(int money) {
        if(accountCheck.checkAccountNumber(accountNumber) && securityCodeCheck.checkSecurityCode(securityCode) && moneyChecker.checkMoney(money)) {
            moneyChecker.withdrawMoney(money);
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Transaction Failed");
        }
    }

    public void depositMoney(int money) {
        if (accountCheck.checkAccountNumber(accountNumber) && securityCodeCheck.checkSecurityCode(securityCode)) {
            moneyChecker.depositMoney(money);
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Transaction Failed");
        }
    }
}
