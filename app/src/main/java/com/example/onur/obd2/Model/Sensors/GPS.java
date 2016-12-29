package com.example.onur.obd2.Model.Sensors;

public class GPS
{
    private double latitude;
    private double longitude;


    public GPS(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

}
