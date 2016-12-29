package com.example.onur.obd2.Model.Sensors;
import com.example.onur.obd2.Model.Sensor;

public class Fuel extends Sensor
{
    private double value;
    public static double maxValue = 300;
    public static double minValue = 0;


    public Fuel(double value)
        {
        this.value = value;
        this.unit = "L";
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
