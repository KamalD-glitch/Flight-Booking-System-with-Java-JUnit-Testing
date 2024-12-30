/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author kdabban
 */
public class Member extends Passenger {
    int yearsOfMembership;

    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    

    @Override
    double applyDiscount(double p) {
        double price;
        if(yearsOfMembership > 5) {
            price = p*0.5;
        } else if(yearsOfMembership > 1 && yearsOfMembership<= 5) {
            price = p*0.9;
        } else {
            price = p;
        }
        return price;
    }
}