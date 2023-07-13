/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight1;

/**
 * Se trata de un programa principal que crea una fábrica de opciones, un
 * vehículo solicitado, le agrega tres opciones y a continuación las muestra.
 */
public class Client {

    public static void main(String[] args) {
        
        FactoryOption factory = new FactoryOption();
        VehicleRequested vehicle = new VehicleRequested();
        vehicle.addOptions("Air Bag", 56000, factory);
        vehicle.addOptions("Direccion asistida", 75000, factory);
        vehicle.addOptions("Climatizador", 45000, factory);
        vehicle.showOptions();
    }
    
}
