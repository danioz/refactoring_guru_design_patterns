package design_patterns.creational.abstractFactory;

import design_patterns.creational.abstractFactory.app.Application;
import design_patterns.creational.abstractFactory.factories.GUIFactory;
import design_patterns.creational.abstractFactory.factories.MacOSFactory;
import design_patterns.creational.abstractFactory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
