package org.ejemploMotor;


//La clase "MotorElectricoAdapter" actúa como un adaptador entre la interfaz de la clase "Motor" y un objeto de la clase "MotorElectrico" que se está adaptando.
public class MotorElectricoAdapter extends Motor{

    //Hacemos una referencia al objeto MotorElectrico que estamos adaptando
    private MotorElectrico motorElectrico;

    //Creamos un constructor que recibe como parámetro un objeto MotorElectrico.
    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    //En la clase "MotorElectricoAdapter", se declara una referencia motorElectrico de tipo "MotorElectrico".
    //Esta referencia se utilizará para hacer referencia al objeto de la clase "MotorElectrico" que estamos adaptando.
    //Se proporciona un constructor que recibe un objeto "MotorElectrico" como parámetro y asigna ese objeto a la referencia motorElectrico.

    @Override
    public void encender() {
        System.out.println("Encendiendo motor eléctrico adapter.");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor eléctrico adapter.");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor eléctrico adapter.");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
//"MotorElectricoAdapter" actúa como un puente entre la interfaz abstracta "Motor" y el objeto "MotorElectrico" que se está adaptando,
// permitiendo que el objeto "MotorElectrico" sea utilizado como si fuera un objeto de la clase "Motor"
// en contextos donde se requiere una instancia de "Motor".