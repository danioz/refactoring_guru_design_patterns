package design_patterns.creational.factory.factory;

import design_patterns.creational.factory.buttons.Button;
import design_patterns.creational.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
