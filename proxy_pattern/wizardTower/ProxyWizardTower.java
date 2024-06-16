package proxy_pattern.wizardTower;

import proxy_pattern.Wizard;

public class ProxyWizardTower implements WizardTower{
    int capacity = 2;
    WizardTower wizardTower;

    public ProxyWizardTower() {
        this.wizardTower = new RealWizardTower();
    }

    @Override
    public void enter(Wizard wizard) {
        if (capacity>0) {
            wizardTower.enter(wizard);
            capacity--;
        } else {
            System.out.println(wizard.getName()+" cannot enter the tower");
        }
    }
}
