// Autor: Muñoz Hernandez Miguel Angel
public class UsoListDobl {
    public static void main(String[] args) {
        // Crear una instancia de la ListaDoble
        ListaDoble miLista = new ListaDoble();

        // Insertar el nodo "A" al principio de la lista
        miLista.insertarDespuesDe(null, "A");

        // Insertar después de "A"
        miLista.insertarDespuesDe("A", "B");
        miLista.imprimir(); // Resultado: null <-> [ A ] <-> [ B ] <-> null

        // Intercambiar "B" y "C"
        miLista.intercambiarNodos("B", "C");
        miLista.imprimir(); // Resultado: null <-> [ A ] <-> [ C ] <-> null
    }
}
