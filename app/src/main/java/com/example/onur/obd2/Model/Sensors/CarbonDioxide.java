package com.example.onur.obd2.Model.Sensors;
import com.example.onur.obd2.Model.Sensor;

public class CarbonDioxide extends Sensor
{
    private double value;
    public static double maxValue=300;
    public static double minValue=0;


    public CarbonDioxide(double value)
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
