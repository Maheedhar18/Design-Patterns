package chain_of_responsibility_pattern;

public class DivideNumbers implements Chain {

    Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalulationMethod()=="divide") {
            System.out.println(request.getNumber1()+"/"+request.getNumber2()+" = "+(request.getNumber1()/request.getNumber2()));
        }
        else
        {
            System.out.println("Only addtion, subtraction, multiplication, division methods are possible");
        }
    }
    
}
