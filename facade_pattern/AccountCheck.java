package facade_pattern;

public class AccountCheck {
    int accountNumber=12345;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean checkAccountNumber(int number) {
        return number==accountNumber;
    }
}
