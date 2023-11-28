package chain_of_responsibility_pattern;

public class AddNumbers implements Chain {

    Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalulationMethod()=="add") {
            System.out.println(request.getNumber1()+"+"+request.getNumber2()+" = "+(request.getNumber1()+request.getNumber2()));
        }
        else {
            nextChain.calculate(request);;
        }
    }
    
    
}
