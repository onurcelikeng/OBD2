package com.example.onur.obd2.Model.Sensors;
import com.example.onur.obd2.Model.Sensor;

public class Control
{
    private Sensor sensor1;
    private Sensor sensor2;


    public Control(Sensor sensor1, Sensor sensor2)
    {

    }


    public Sensor getSensor1() {
        return sensor1;
    }

    public void setSensor1(Sensor sensor1) {
        this.sensor1 = sensor1;
    }

    public Sensor getSensor2() {
        return sensor2;
    }

    public void setSensor2(Sensor sensor2) {
        this.sensor2 = sensor2;
    }
}
