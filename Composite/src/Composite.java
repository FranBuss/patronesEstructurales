import java.util.ArrayList;

class Composite extends Componente
{
    private ArrayList<Componente> hijo = new ArrayList<Componente>();
    public Composite (String name)
    {
        super(name);
    }
    public void Agregar(Componente componente)
    {
        hijo.add(componente);
    }
    public void Remover(Componente componente)
    {
        hijo.remove(componente);
    }
    public void Mostrar(int profundidad)
    {
        System.out.println(nombre + " nivel: " + profundidad);
        for (int i = 0; i < hijo.size(); i++)
            hijo.get(i).Mostrar(profundidad + 1);
    }
}
