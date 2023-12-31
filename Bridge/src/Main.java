//En este método se crean instancias de la clase "TV" y la clase "Radio",
// y se utilizan objetos de las clases "ControlRemoto" y "ControlRemotoAvanzado" para controlar los dispositivos.


public class Main {

    public static void main(String[] args) {

        TV Objtelevision = new TV();
        ControlRemoto controlTv = new ControlRemoto(Objtelevision);

        controlTv.encenderApagar();
        controlTv.canalAnterior();
        controlTv.canalSiguiente();
        controlTv.subirVolumen();
        controlTv.bajarVolumen();

        System.out.println("--------------------------------------------------------");

        Radio radio = new Radio();
        ControlRemotoAvanzado controlRadio = new ControlRemotoAvanzado(radio);
        controlRadio.encenderApagar();
        controlRadio.record();
        controlRadio.subirVolumen();
        controlRadio.mute();
    }

}