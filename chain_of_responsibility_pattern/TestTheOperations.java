package chain_of_responsibility_pattern;

public class TestTheOperations {
    
    public static void main(String[] args) {
        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubtractNumbers();
        Chain chain3 = new MultiplyNumbers();
        Chain chain4 = new DivideNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers request1 = new Numbers(2, 3, "add");
        chain1.calculate(request1);

        Numbers request2 = new Numbers(2, 3, "subtract");
        chain1.calculate(request2);

        Numbers request3 = new Numbers(2, 3, "multiply");
        chain1.calculate(request3);

        Numbers request4 = new Numbers(2, 3, "divide");
        chain1.calculate(request4);

        Numbers request5 = new Numbers(2, 3, "mod");
        chain1.calculate(request5);
    }

}
