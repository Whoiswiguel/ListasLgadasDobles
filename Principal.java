public class Principal {

    public static void main(String[] args) {

        ListaDoble miLista = new ListaDoble();

        // Insertar el nodo "A" al inicio de la lista
        miLista.insertarDespuesDe(null, "A");

        // Insertar después de "A"
        miLista.insertarDespuesDe("A", "B");
        miLista.imprimir(); // Resultado: null <-> [ A ] <-> [ B ] <-> null

        // Intercambiar "B" y "C"
        miLista.intercambiarNodos("B", "C");
        miLista.imprimir(); // Resultado: null <-> [ A ] <-> [ C ] <-> null
    }
}
