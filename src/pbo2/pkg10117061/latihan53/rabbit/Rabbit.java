/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan53.rabbit;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menampilkan nama, sifat dan lain-lain dari binatang
 * 
 */
public class Rabbit extends Animal{

    private String color;
    private String name;

   
    public Rabbit(String color, String name, boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
        this.color = color;
        this.name = name;
        System.out.println("Hello,his name is " + name);
        System.out.println(name + " is vegetarian?" + vegetarian);
        System.out.println(name + " eats " + food);
        System.out.println(name + " has " + legs + " legs ");
        System.out.println(name + " color is " + color);
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
