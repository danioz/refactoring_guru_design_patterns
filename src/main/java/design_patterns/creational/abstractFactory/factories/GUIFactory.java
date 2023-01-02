package design_patterns.creational.abstractFactory.factories;

import design_patterns.creational.abstractFactory.buttons.Button;
import design_patterns.creational.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
