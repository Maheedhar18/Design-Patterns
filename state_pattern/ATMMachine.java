package state_pattern;

import state_pattern.state.*;

public class ATMMachine {
    
    public ATMState hasCard;
    public ATMState noCard;
    public ATMState hasPin;
    public ATMState atmOutOfMoney;

    public ATMState atmState;

    public int cashInMachine = 2000;
    public boolean correctPinEntered = false;

    public ATMMachine() 
    {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine == 0)
        {
            atmState = atmOutOfMoney;
        }
    }

    public void setATMState(ATMState newATMState)
    {
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine)
    {
        cashInMachine = newCashInMachine;
    }

    public void insertCard()
    {
        atmState.insertCard();
    }

    public void ejectCard()
    {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw)
    {
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered)
    {
        atmState.insertPin(pinEntered);
    }

    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

}
