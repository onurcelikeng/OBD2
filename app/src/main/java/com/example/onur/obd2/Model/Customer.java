package com.example.onur.obd2.Model;

public class Customer
{
    private String name;
    private String eMail;
    private String phone;
    private Vehicle vehicle;


    public Customer(String name, String eMail, String phone, Vehicle vehicle)
    {
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
        this.vehicle = vehicle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
