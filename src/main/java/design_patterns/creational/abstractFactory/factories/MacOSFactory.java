package design_patterns.creational.abstractFactory.factories;

import design_patterns.creational.abstractFactory.buttons.Button;
import design_patterns.creational.abstractFactory.buttons.MacOSButton;
import design_patterns.creational.abstractFactory.checkboxes.Checkbox;
import design_patterns.creational.abstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
