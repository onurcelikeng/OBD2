package com.example.onur.obd2.Model;

public abstract class Sensor
{
    protected String unit;


    public Sensor() {

    }


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
