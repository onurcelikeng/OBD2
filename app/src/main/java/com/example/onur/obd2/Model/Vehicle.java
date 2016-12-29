package com.example.onur.obd2.Model;
import com.example.onur.obd2.Model.Sensors.Control;

public class Vehicle
{
    private String chassisNumber;
    private String type;
    private String brand;
    private String model;
    private int year;
    private Sensor sensor;
    private Control control;


    public Vehicle(String chassisNumber, String type, String brand, String model, int year)
    {
        this.chassisNumber = chassisNumber;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

}
