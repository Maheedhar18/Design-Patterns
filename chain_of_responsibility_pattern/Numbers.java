package chain_of_responsibility_pattern;

public class Numbers {

    private int number1;
    private int number2;
    private String calculationMethod;

    public Numbers(int number1, int number2, String calculationMethod)
    {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationMethod = calculationMethod;
    }

    public int getNumber1() { return number1; }
    public int getNumber2() { return number2; }
    public String getCalulationMethod() { return calculationMethod; }
    
}
