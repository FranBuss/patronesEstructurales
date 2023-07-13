package org.ejemploMotor;


//La clase "MotorComun" proporciona una implementación específica para los métodos abstractos heredados de la clase "Motor".
public class MotorComun extends Motor {


    @Override
    public void encender() {

        System.out.println("Encendiendo motor común");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor común");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor común");
    }

}
