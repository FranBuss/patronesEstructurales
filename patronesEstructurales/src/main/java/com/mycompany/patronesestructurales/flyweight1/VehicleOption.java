/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight1;

/**
 * La clase VehicleOption posee un constructor que permite definir el estado
 * intrínseco de la opción. En este ejemplo, a parte del nombre, los demás
 * atributos toman valores constantes o que están basados directamente en el
 * nombre. Normalmente, estos valores deberían provenir de una base de datos. El
 * método visualiza recibe el precio de venta como parámetro, que constituye el
 * estado extrínseco.
 */
public class VehicleOption {
 protected String name;
 protected String description;
 protected int standardPrice;

    public VehicleOption(String name) {
        this.name = name;
        this.description = "Description of " + name;
        this.standardPrice = 1500;
    }

  public void visualize(int salePrice){
      System.out.println("Option");
      System.out.println("Name: " + name);
      System.out.println(description);
      System.out.println("Standard price: " + standardPrice);
      System.out.println("Sale price: " + salePrice);
  }
 
 
 
}
