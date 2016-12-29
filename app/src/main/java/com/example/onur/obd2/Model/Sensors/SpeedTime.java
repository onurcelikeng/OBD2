package com.example.onur.obd2.Model.Sensors;
import com.example.onur.obd2.Model.Sensor;

public class SpeedTime extends Sensor
{
    private double value;
    public static double maxValue = 260;
    public static double minValue = 0;


    public SpeedTime(double value)
    {
        this.value = value;
        this.unit = "Km/h";
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
