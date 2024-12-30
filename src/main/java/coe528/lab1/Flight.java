package coe528.lab1;

/**
 *
 * @author kdabban
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int flightNumber,String origin,String destination,String departureTime,int capacity,double originalPrice){
    try{
        if (origin.compareTo(destination)== 0){
            throw new IllegalArgumentException("Origin cannot be the same location as destination.");
        }
        else {
            this.flightNumber = flightNumber;
            this.origin = origin;
            this.destination = destination;
            this.departureTime = departureTime;
            this.capacity = capacity;
            this.originalPrice = originalPrice;
            this.numberOfSeatsLeft = capacity;
        }
    }
    catch(IllegalArgumentException e){ System.out.println(e);}
    }
    
    //Setter methods here:
    public void setFlightNumber(int flightNumber){this.flightNumber = flightNumber;}
    
    public void setOrigin(String origin){
        try{
            if(origin.compareTo(destination)== 1)
                this.origin = origin;
            else
                throw new IllegalArgumentException("Flight No. " + flightNumber + " has the same location for both Origin and Destination.");
        }
        catch(IllegalArgumentException e){System.out.println(e.toString());}
    }
    
    public void setDestination(String destination){
        try{
            if(destination.compareTo(origin)== 1)
                this.destination = destination;
            else
                throw new IllegalArgumentException("Flight No. " + flightNumber + " has the same location for both Origin and Destination.");
        }
        catch(IllegalArgumentException e){System.out.println(e.toString());}
    }
    
    public void setDepartureTime(String departureTime){this.departureTime = departureTime;}

    public boolean setCapacity(int capacity, boolean resetPlane){//resetPlane - if true, plane is cleared, if false, plane is not cleared.
        int temp = numberOfSeatsLeft + (this.capacity - capacity);
        if(temp > 0 && resetPlane != true){
            numberOfSeatsLeft = temp;
            this.capacity = capacity;
            return false;
        }
        else{
            this.capacity = capacity;
            numberOfSeatsLeft = capacity;
            return true;
        }
    }
    
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){this.numberOfSeatsLeft = numberOfSeatsLeft;}
    
    public void setOriginalPrice(double originalPrice){this.originalPrice = originalPrice;}

    //Getter methods here:
    public int getFlightNumber(){return flightNumber;}
    public String getOrigin(){return origin;}
    public String getDestination(){return destination;}
    public String getDepartureTime(){return departureTime;}
    public int getCapacity(){return capacity;}
    public int getNumberOfSeatsLeft(){return numberOfSeatsLeft;}
    public double getOriginalPrice(){return originalPrice;}
    
    //Doer methods here:
    public boolean bookASeat(){
        if(numberOfSeatsLeft > 0){
            numberOfSeatsLeft--;
            return true;
        }
        else{
            return false;
        }  
    }
    
    @Override
    public String toString(){
        return "Flight: " + this.flightNumber + " " + this.origin + " to " + this.destination + ", " + this.departureTime + ", Original Price: $" + this.originalPrice;
    }
    
}
