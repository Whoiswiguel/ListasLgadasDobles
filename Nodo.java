
public class Nodo {
    String nombre; // campo de datos
    Nodo next; // enlace al siguiente nodo
    Nodo prev; // enlace al nodo anterior

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.next = null;
        this.prev = null;
    }
}
