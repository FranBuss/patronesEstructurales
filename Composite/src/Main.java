public class Main {
    public static void main(String[] args) {
        Composite raiz = new Composite("root");
        raiz.Agregar(new Hoja("hoja A"));
        raiz.Agregar(new Hoja("hoja B"));
        Composite comp = new Composite("compuesto X");
        comp.Agregar(new Hoja("hoja XA"));
        comp.Agregar(new Hoja("hoja XB"));
        raiz.Agregar(comp);
        raiz.Agregar(new Hoja("hoja C"));
        Hoja l = new Hoja("hoja D");
        raiz.Agregar(l);
        raiz.Remover(l);
        raiz.Mostrar(1);
    }
}