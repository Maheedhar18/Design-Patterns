package template_pattern.pizza;

public abstract class Pizza {

    public Pizza() {
    }

    public final void makePizza() {
        makeBase();
        if(wantsMeat()){
            addMeat();
        }
        if(wantsVeggie()) {
            addVeggie();
        }
        cutPizza();
        System.out.println("Pizza is done\n");
    }

    public void cutPizza() {
        System.out.println("Pizza is cut into 4 pieces");
    }

    // These methods must be overridden by the extending subclasses
    public abstract void addVeggie();
    public abstract void addMeat();

    // The following are called hooks
    // If the user wants to override these they can

    // Use abstract methods when you want to force the user
    // to override and use a hook when you want it to be optional

    public boolean wantsVeggie(){
        return true;
    }

    public boolean wantsMeat() {
        return true;
    }

    public void makeBase() {
        System.out.println("Pizza Base is done using dough");
    }


}
