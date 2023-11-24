package state_pattern;

public class HasCard implements ATMState{

    ATMMachine atmMachine;

    public HasCard(ATMMachine newAtmMachine)
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
        if (pinEntered == 1234)
        {
            System.out.println("Correct PIN entered");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        }
        else 
        {
            System.out.println("Wrong PIN entered");
            atmMachine.correctPinEntered = false;
            ejectCard();
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN first");
    }
    
    
}
