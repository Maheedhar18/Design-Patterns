package chain_of_responsibility_pattern;

public interface Chain {
    
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);

}
