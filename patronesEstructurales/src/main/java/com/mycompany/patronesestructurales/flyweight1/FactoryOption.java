/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight1;

import java.util.Map;
import java.util.TreeMap;

/**
 * La clase FactoryOption gestiona la comparticion de las opciones con ayuda de
 * un diccionario, cuya clave de acceso esel nombre de la opcion. El metodo
 * getOption busca en este diccionario y si no encuentra la opcion, la crea, la
 * agrega al diccionario y la devuelve
 */
public class FactoryOption {

    protected Map<String, VehicleOption> options = new TreeMap<String, VehicleOption>();

    public VehicleOption getOption(String name) {
        VehicleOption result;

        if (options.containsKey(name)) {
            return options.get(name);
        } else {
            result = new VehicleOption(name);
            options.put(name, result);
        }
        return result;

    }
}
