public abstract class Componente
{
    protected String nombre;
    public Componente (String nombre)
    {
        this.nombre = nombre;
    }
    abstract public void Agregar(Componente c);
    abstract public void Remover(Componente c);
    abstract public void Mostrar(int profundidad);
}
