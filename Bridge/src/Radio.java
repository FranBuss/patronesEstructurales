//La clase "Radio" implementa la interfaz "Dispositivo" y proporciona implementaciones para todos los métodos definidos en la interfaz.

public class Radio implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 50;
    private int canal = 1;

    public Radio() {
    }

    public boolean estaEncendido() {
        return this.encendido;
    }

    public void encender() {
        System.out.println("encendiendo radio.... ");
        this.encendido = true;
    }

    public void apagar() {
        System.out.println("apagando radio.... ");
        this.encendido = false;
    }

    public int getVolumen() {
        System.out.println("el volumen de la Radio esta en: " + this.volumen);
        return this.volumen;
    }

    public void setVolumen(int porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.volumen = porcentaje;
            System.out.println("cambiando el volumen de la radio a: " + porcentaje);
        }

    }

    public int getCanal() {
        System.out.println("la emisora de la radio es: " + this.canal);
        return this.canal;
    }

    public void setCanal(int canal) {
        System.out.println("cambiando  emisora de la radio a: " + canal);
        this.canal = canal;
    }
}
