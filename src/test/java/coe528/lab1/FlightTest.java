/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kdabban
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testConstructor() {
        System.out.println("Valid Constructor");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        String testDestination = instance.getDestination();
        String testOrigin = instance.getOrigin();
        // TODO review the generated test code and remove the default call to fail.
        if(testOrigin.compareTo(testDestination)== 0){fail("Constructor is NOT VALID, since IllegalArgumentException was thrown");}
        else{System.out.println("Constructor is VALID, since no exception was thrown.");}
    }
    
    
    //FIX THIS, KAMAL. FIND OUT HOW TO DEAL WITH THIS EXCEPTION ERROR. 
    @Test
    public void testInvalidConstructor() {
        System.out.println("InValid Constructor");
        Flight instance = new Flight(100,"Toronto","Toronto","03/02/24 10:30 AM",30,1000);
        String testDestination = "Toronto";
        String testOrigin = "Toronto";
        // TODO review the generated test code and remove the default call to fail.
        if(testOrigin.equals(testDestination)){System.out.println("Invalid Constructor is VALID, since an exception was thrown BUT COUGHT.");}
        else{fail("Invalid Constructor is NOT VALID, since no exception was thrown");}
    }
    
    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        int testFlightNumber = 100;
        instance.setFlightNumber(testFlightNumber);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getFlightNumber(), testFlightNumber); //checks if test value equals called result.
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String testOrigin = "Toronto";
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        instance.setOrigin(testOrigin);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getOrigin(), testOrigin); //checks if test value equals called result.
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String testDestination = "Riyadh";
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        instance.setDestination(testDestination);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getDestination(), testDestination); //checks if test value equals called result.
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    
    //FINISH EDITING HERE:
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String testDepartureTime = "03/02/24 10:30 AM";
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        instance.setDepartureTime(testDepartureTime);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getDepartureTime(), testDepartureTime); //checks if test value equals called result.
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int testCapacity = 30;
        boolean resetPlane = false;
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        boolean expResult = false;
        boolean result = instance.setCapacity(testCapacity, resetPlane);
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int testNumberOfSeatsLeft = 30; // DOUBLE CHECK IF THIS TEST PASSES
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        instance.setNumberOfSeatsLeft(testNumberOfSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getNumberOfSeatsLeft(), testNumberOfSeatsLeft); //checks if test value equals called result.    }
    }
    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double testOriginalPrice = 1000;
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        instance.setOriginalPrice(testOriginalPrice);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getOriginalPrice(), testOriginalPrice); //checks if test value equals called result.
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        int expResult = 100;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        String expResult = "Riyadh";
        String result = instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        String expResult = "03/02/24 10:30 AM";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        int expResult = 30;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        int expResult = 30;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        double expResult = 1000;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(100,"Toronto","Riyadh","03/02/24 10:30 AM",30,1000);
        String expResult = "Flight: 100 Toronto to Riyadh, 03/02/24 10:30 AM, Original Price: $1000.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
