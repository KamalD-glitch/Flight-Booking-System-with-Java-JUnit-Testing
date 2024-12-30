/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

import coe528.lab1.Flight;

/**
 *
 * @author kdabban
 */
public class Ticket {
    Passenger passenger;
    Flight flight;
    double price;
    static int number = 0;
    
    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
         this.number += 1;
    }
    //setter methods: (only the ticket price will have a setter method. Other datas are called from other classes)
    public void setPrice(double price){this.price = price;}
    
    
    //getter methods:
    public Passenger getPassenger() {return passenger;}
    public Flight getFlight() {return flight;}
    public double getPrice() {return price;}
    
    
    @Override
    public String toString() {
        String name = passenger.getName();
        int flightNumber = flight.getFlightNumber();
        String origin = flight.getOrigin();
        String destination = flight.getDestination();
        String departureTime = flight.getDepartureTime();
        double originalPrice = flight.getOriginalPrice();
        return name + ", Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime
                + ", original price: $" + originalPrice + ", ticket price: $" + price;
    }
}