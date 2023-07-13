//Esta interfaz define los métodos que deben ser implementados por cualquier clase que represente un dispositivo.

public interface Dispositivo {

    boolean estaEncendido();

    void encender();

    void apagar();

    int getVolumen();

    void setVolumen(int var1);

    int getCanal();

    void setCanal(int var1);

}
