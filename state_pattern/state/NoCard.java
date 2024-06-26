package state_pattern.state;

import state_pattern.ATMMachine;

public class NoCard implements ATMState{
    ATMMachine atmMachine;

    public NoCard(ATMMachine newAtmMachine)
    {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter a card first");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a card first");
    }
}
