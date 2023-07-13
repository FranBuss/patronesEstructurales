package org.ejemploMotor;

public class Main {

    public static void main(String[] args) {


        //Se crean instancias de diferentes tipos de motores,
        // incluyendo un motor diesel, un motor común y un motor eléctrico adaptado

        Motor motor1 = new MotorDiesel();
        Motor motor2 = new MotorComun();
        Motor motor3 = new MotorElectricoAdapter(new MotorElectrico());


        System.out.println("-----------------Motor Diesel---------------------------");

        motor1.encender();
        motor1.acelerar();
        motor1.apagar();

        System.out.println("------------------Motor Comun---------------------------");

        motor2.encender();
        motor2.acelerar();
        motor2.apagar();

        System.out.println("-------------------Motor electrico Adapter--------------");

        motor3.encender();
        motor3.acelerar();
        motor3.apagar();

    }
}
// Este código proporciona un ejemplo de cómo se pueden utilizar diferentes tipos de motores
// y cómo se puede adaptar un motor eléctrico utilizando un adaptador para que sea compatible con la interfaz de la clase abstracta "Motor".
