package design_patterns.creational.builder.builders;

import design_patterns.creational.builder.cars.CarType;
import design_patterns.creational.builder.components.Engine;
import design_patterns.creational.builder.components.GPSNavigator;
import design_patterns.creational.builder.components.Transmission;
import design_patterns.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
