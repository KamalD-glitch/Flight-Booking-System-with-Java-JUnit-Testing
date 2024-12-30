/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

import coe528.lab1.Flight;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author kdabban
 */
public class Manager {
    //instance variables:
    ArrayList<Flight> flights;
    ArrayList<Ticket> tickets;
    
    //constructor:
    public Manager() {
        flights = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    //setter methods below:
    
    
    //getter methods below:
    public Flight getFlight(int flightNumber) {
        for (int i = 0; i <= flights.size() - 1; i++) {
            if (flights.get(i).getFlightNumber() == flightNumber) {
                return flights.get(i);
            }
        }
        return null;
    }
    
    //doer methods below:
    
    
    //createFlights() method:
    public void createFlights() {
        Scanner userIn = new Scanner(System.in);
        String input, origin, destination, departureTime;
        int flightNumber = 0, capacity = 0;
        double originalPrice = 0;
        
        //Needed User inputs for createFlights().
        System.out.println("Adding a new flight.");
        System.out.println("Flight Number: ");
        input = userIn.nextLine();
        
        try {
            flightNumber = Integer.parseInt(input); //catching possible format errors, when reading User inputs.
        } catch (NumberFormatException e) {
            System.out.println("Flight Number not valid");
            createFlights();
        }

        System.out.println("Origin: ");
        input = userIn.nextLine();
        origin = input;
        System.out.println("Destination: ");
        input = userIn.nextLine();
        destination = input;
        System.out.println("Departure Time: ");
        input = userIn.nextLine();
        departureTime = input;
        System.out.println("Capacity: ");
        input = userIn.nextLine();
        
        try {
            capacity = Integer.parseInt(input); //catching possible format errors, when reading User inputs.
        } catch (NumberFormatException e) {
            System.out.println("Capacity not valid");
            createFlights();
        }

        System.out.println("Original Price: ");
        input = userIn.nextLine();
        
        try {
            originalPrice = Double.valueOf(input); //catching possible format errors, when reading User inputs.
        } catch (NumberFormatException e) {
            System.out.println("Original Price not valid");
            createFlights();
        }
        
        //adding objects to list of flights with scanned User data.
        Flight f = new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice);
        flights.add(f);
        System.out.println("This flight has been added: ");
        System.out.println(f);
    }

    //displayAvailableFlights() method:
    public void displayAvailableFlights(String origin, String destination) {
        boolean flightsAvailable = false;
        for (int i = 0; i <= flights.size() - 1; i++) {
            if (flights.get(i).getOrigin().equals(origin) && flights.get(i).getDestination().equals(destination) && flights.get(i).getNumberOfSeatsLeft() > 0) {
                if (flightsAvailable == false) {
                    System.out.println("Flights available: ");
                    flightsAvailable = true;
                }
                System.out.println(flights.get(i));
            }
        }
        if (flightsAvailable == false) {
            System.out.println("No flights are available.");
        }
    }

    //bookSeat() method:
    public void bookSeat(int flightNumber, Passenger p) {
        int index = 0;
        boolean flightAvailable = false;
        double ticketPrice;
        for (int i = 0; i <= flights.size() - 1; i++) {
            if (flights.get(i).getFlightNumber() == flightNumber) {
                index = i;
                flightAvailable = true;
            }
        }
        if (flightAvailable && flights.get(index).getNumberOfSeatsLeft() > 0) {
            flights.get(index).bookASeat();
            ticketPrice = p.applyDiscount(flights.get(index).getOriginalPrice());
            Ticket ticket = new Ticket(p, flights.get(index), ticketPrice);
            tickets.add(ticket);
            System.out.println("The ticket for flight number " + flights.get(index).getFlightNumber() + " has been booked with ticket " + ticket);
        } else if (flightAvailable == false && flights.get(index).getNumberOfSeatsLeft() > 0) {
            System.out.println("This flight number does not exist");
        } else if (flightAvailable && flights.get(index).getNumberOfSeatsLeft() < 0) {
            System.out.println("There are no more seats left on the plane");
        } else {
            System.out.println("Error");
        }

    }

    //MAIN HERE****
    public static void main(String[] args) {
        Manager M = new Manager();
        System.out.println("Welcome to the flight management system.");
        Scanner userIn = new Scanner(System.in);
        String input;
        OUTER:
        while (true) {
            System.out.println("Type 'flight' to add a flight");
            System.out.println("Type 'plan' to see available flights on a specific route");
            System.out.println("Type 'number' to see info about a flight based on the flight number");
            System.out.println("Type 'book' to book a ticket for a flight");
            System.out.println("Type 'end' to end program");
            System.out.println("Input: ");
            input = userIn.nextLine();
            OUTER_1:
            switch (input) {
                case "flight":
                    M.createFlights();
                    break;
                case "plan":
                    String origin, destination;
                    System.out.println("Origin: ");
                    origin = userIn.nextLine();
                    System.out.println("Destination: ");
                    destination = userIn.nextLine();
                    M.displayAvailableFlights(origin, destination);
                    break;
                case "number": {
                    int flightNumber;
                    System.out.println("Flight number: ");
                    input = userIn.nextLine();
                    try {
                        flightNumber = Integer.parseInt(input);
                        if (M.getFlight(flightNumber) == null) {
                            System.out.println("Flight does not exist");
                        } else {
                            System.out.println(M.getFlight(flightNumber));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please input an integer value");
                    }
                    break;
                }
                case "book":
                    {
                        int flightNumber = 0, age, yearsMember;
                        String name;
                        Passenger p = null;
                        System.out.println("Passengers name: ");
                        name = userIn.nextLine();
                        System.out.println("Passengers age: ");
                        input = userIn.nextLine();
                        try {
                            age = Integer.parseInt(input);
                        } catch (NumberFormatException e) {
                            System.out.println("Please input an integer value");
                            break;
                        }   System.out.println("Is the passenger a member (yes/no):");
                        input = userIn.nextLine();
                        switch (input) {
                            case "yes":
                                System.out.println("Number of years they've been a member: ");
                                input = userIn.nextLine();
                                try {
                                    yearsMember = Integer.parseInt(input);
                                } catch (NumberFormatException e) {
                                    System.out.println("Please input an integer value");
                                    break OUTER_1;
                                }
                                p = new Member(name, age, yearsMember);
                                break;
                            case "no":
                                p = new NonMember(name, age);
                                break;
                            default:
                                System.out.println("Please input yes or no");
                                break;
                        }
                        System.out.println("Flight number: ");
                        input = userIn.nextLine();
                        try {
                            if (M.getFlight(Integer.parseInt(input)) == null) {
                                System.out.println("Flight does not exist");
                                break;
                            } else {
                                flightNumber = Integer.parseInt(input);
                            }
                            M.bookSeat(flightNumber, p);
                        } catch (NumberFormatException e) {
                            System.out.println("Please input an integer value");
                            break;
                        }   break;
                    }
                case "end":
                    break OUTER;
                default:
                    System.out.println("Please inflightput one of the options");
                    break;
            }
        }
    }
}
