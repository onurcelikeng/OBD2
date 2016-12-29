package com.example.onur.obd2.Model;

public class CarCareCenter
{
    private Customer customer;
    public static int time;


    public CarCareCenter(Customer customer)
    {
        this.customer = customer;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
