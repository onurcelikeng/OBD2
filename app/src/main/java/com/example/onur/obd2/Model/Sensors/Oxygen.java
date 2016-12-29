package com.example.onur.obd2.Model.Sensors;
import com.example.onur.obd2.Model.Sensor;

public class Oxygen extends Sensor
{
    private double value;
    public static double maxValue = 250;
    public static double minValue = 0;


    public Oxygen(double value)
    {
        this.value = value;
        this.unit = "ATM";
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
