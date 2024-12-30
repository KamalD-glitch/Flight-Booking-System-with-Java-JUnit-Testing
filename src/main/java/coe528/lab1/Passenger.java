/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author kdabban
 */
public abstract class Passenger {
    protected String name;
    protected int age;
    
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //setter methods:
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    //getter methods:
    public String getName() {return name;}
    public int getAge() {return age;}
    
    //Doer methods here:
    abstract double applyDiscount(double p);
}
