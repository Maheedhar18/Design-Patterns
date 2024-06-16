package proxy_pattern.wizardTower;

import proxy_pattern.Wizard;

public class RealWizardTower implements WizardTower{
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.getName()+" enters the tower");
    }
}
