package com.example.onur.obd2.Model.Sensors;
import com.example.onur.obd2.Model.Sensor;

public class WiperWater extends Sensor
{
    private double value;
    public static double minValue = 0;
    public static double maxValue = 500;


    public WiperWater(double value)
    {
        this.value = value;
        this.unit = "litre";
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
