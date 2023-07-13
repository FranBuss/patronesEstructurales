//Esta clase representa un control remoto genérico para dispositivos
// proporciona métodos para controlar el encendido y apagado, el volumen y los canales de un dispositivo.


public class ControlRemoto {

    protected Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void encenderApagar() {
        if (this.dispositivo.estaEncendido()) {
            this.dispositivo.apagar();
        } else {
            this.dispositivo.encender();
        }

    }

    public void subirVolumen() {
        this.dispositivo.setVolumen(this.dispositivo.getVolumen() + 10);
    }

    public void bajarVolumen() {
        this.dispositivo.setVolumen(this.dispositivo.getVolumen() - 10);
    }

    public void canalSiguiente() {
        this.dispositivo.setCanal(this.dispositivo.getCanal() + 1);
    }

    public void canalAnterior() {
        this.dispositivo.setCanal(this.dispositivo.getCanal() - 1);
    }
}
