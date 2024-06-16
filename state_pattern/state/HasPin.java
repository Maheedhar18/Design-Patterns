package state_pattern.state;

import state_pattern.ATMMachine;

public class HasPin implements ATMState {
    ATMMachine atmMachine;

    public HasPin(ATMMachine newAtmMachine)
    {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Pin already entered");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine)
        {
            System.out.println("Dont have enough cash");
            ejectCard();
        }
        else
        {
            System.out.println(cashToWithdraw + " is provided by ATM machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine-cashToWithdraw);
            ejectCard();
            if (atmMachine.cashInMachine <= 0)
            {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }
    
}
