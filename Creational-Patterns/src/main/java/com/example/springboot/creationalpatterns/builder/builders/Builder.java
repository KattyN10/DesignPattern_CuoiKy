package com.example.springboot.creationalpatterns.builder.builders;

import com.example.springboot.creationalpatterns.builder.cars.Type;
import com.example.springboot.creationalpatterns.builder.components.Engine;
import com.example.springboot.creationalpatterns.builder.components.GPSNavigator;
import com.example.springboot.creationalpatterns.builder.components.Transmission;
import com.example.springboot.creationalpatterns.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
