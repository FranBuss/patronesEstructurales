public class Main {
    public static void main(String[] args) {
        Composite raiz = new Composite("raiz");
        raiz.Agregar(new Hoja("hoja A"));
        raiz.Agregar(new Hoja("hoja B"));

        Composite comp = new Composite("compuesto X");
        comp.Agregar(new Hoja("hoja XA"));
        comp.Agregar(new Hoja("hoja XB"));

        raiz.Agregar(comp);
        raiz.Agregar(new Hoja("hoja C"));

        Composite comp2 = new Composite("Compuesto y");
        comp2.Agregar(new Hoja("Hoja YA"));
        comp2.Agregar(new Hoja("Hoja YB"));
        comp2.Agregar(new Hoja("Hoja YC"));

        Composite comp3 = new Composite("Compuesto Z");
        comp3.Agregar(new Hoja("Hoja AX"));
        comp3.Agregar(new Hoja("Hoja BX"));
        comp3.Agregar(new Hoja("Hoja CX"));

        comp2.Agregar(comp3);
        raiz.Agregar(comp2);

//        Hoja l = new Hoja("hoja D");
//        raiz.Agregar(l);
//        raiz.Remover(l);

        raiz.Mostrar(1);
    }
}