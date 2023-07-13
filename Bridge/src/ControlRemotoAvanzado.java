
//Se proporciona un constructor que recibe un objeto "Dispositivo"
// y llama al constructor de la clase padre utilizando la palabra clave super para inicializar el campo "dispositivo" de la clase padre.

class ControlRemotoAvanzado extends ControlRemoto {
    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }


    //Esto se logra llamando al método "setVolumen" del objeto "dispositivo" con el valor 0.
    public void mute() {
        this.dispositivo.setVolumen(0);
    }

    public void record() {
        System.out.println("grabando programacion...");
    }
}

//La clase "ControlRemotoAvanzado" agrega dos nuevos métodos, "mute" y "record", a la funcionalidad existente del control remoto.