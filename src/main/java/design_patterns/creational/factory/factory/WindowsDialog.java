package design_patterns.creational.factory.factory;

import design_patterns.creational.factory.buttons.Button;
import design_patterns.creational.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
