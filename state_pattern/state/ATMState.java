package state_pattern.state;

public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
    
}
