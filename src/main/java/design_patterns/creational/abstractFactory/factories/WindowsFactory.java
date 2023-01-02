package design_patterns.creational.abstractFactory.factories;

import design_patterns.creational.abstractFactory.buttons.Button;
import design_patterns.creational.abstractFactory.buttons.WindowsButton;
import design_patterns.creational.abstractFactory.checkboxes.Checkbox;
import design_patterns.creational.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
