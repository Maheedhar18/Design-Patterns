package state_pattern.state;

import state_pattern.ATMMachine;

public class NoCash implements ATMState {
    ATMMachine atmMachine;

    public NoCash(ATMMachine newAtmMachine)
    {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No cash currently");
    }

    @Override
    public void ejectCard() {
        System.out.println("No cash currently");    
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("No cash currently");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("No cash currently");
    }
    
}
