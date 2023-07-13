//La clase "TV" implementa la interfaz "Dispositivo" y proporciona implementaciones para todos los métodos definidos en la interfaz.

public class TV implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 30;
    private int canal = 1;

    public TV() {
    }

    public boolean estaEncendido() {
        return this.encendido;
    }

    public void encender() {
        System.out.println("encendiendo tv... ");
        this.encendido = true;
    }

    public void apagar() {
        System.out.println("apagando tv... ");
        this.encendido = false;
    }

    public int getVolumen() {
        System.out.println("el volumen de la tv esta en: " + this.volumen);
        return this.volumen;
    }

    public void setVolumen(int porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.volumen = porcentaje;
            System.out.println("cambiando el volumen de la tv a: " + porcentaje);
        }

    }

    public int getCanal() {
        System.out.println("el canal de la tv es: " + this.canal);
        return this.canal;
    }

    public void setCanal(int canal) {
        System.out.println("cambiando el canal de la tv a: " + canal);
        this.canal = canal;
    }
}