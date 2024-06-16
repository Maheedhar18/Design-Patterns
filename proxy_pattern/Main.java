package proxy_pattern;

import proxy_pattern.wizardTower.ProxyWizardTower;
import proxy_pattern.wizardTower.WizardTower;

// The Proxy pattern in Java provides a surrogate or placeholder to effectively control access to an object, enhancing security and resource management.



public class Main {
    public static void main(String[] args) {
        WizardTower proxyWizardTower = new ProxyWizardTower();
        proxyWizardTower.enter(new Wizard("Red Wizard"));
        proxyWizardTower.enter(new Wizard("Blue Wizard"));
        proxyWizardTower.enter(new Wizard("Black Wizard"));
        proxyWizardTower.enter(new Wizard("White Wizard"));

    }
}
