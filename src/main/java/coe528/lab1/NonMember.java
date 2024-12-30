/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author kdabban
 */
public class NonMember extends Passenger{

    public NonMember(String name, int age) {
        super(name, age);
    }

    @Override
    double applyDiscount(double p) {
        double price;
        if(this.age > 65) {
            price = p*0.9;
        } else {
            price = p;
        }
        return price;
    }
    
}