// Autor: Muñoz Hernandez Miguel Angel

public class ListaDobles_ {
    private Nodo cabeza; // referencia al primer nodo de la lista

    public ListaDoble() {
        this.cabeza = null; // al inicio, la lista está vacía
    }

    // Método para insertar un nuevo nodo después de un nodo específico
    public void insertarDespuesDe(String clave, String nuevoValor) {
        Nodo nuevoNodo = new Nodo(nuevoValor);

        if (clave == null) {
            // Insertar al principio de la lista
            nuevoNodo.siguiente = this.cabeza;
            if (this.cabeza != null) {
                this.cabeza.anterior = nuevoNodo;
            }
            this.cabeza = nuevoNodo;
        } else {
            // Buscar el nodo con clave y insertar después de él
            Nodo temp = buscarPorValor(clave);
            if (temp != null) {
                nuevoNodo.siguiente = temp.siguiente;
                nuevoNodo.anterior = temp;
                if (temp.siguiente != null) {
                    temp.siguiente.anterior = nuevoNodo;
                }
                temp.siguiente = nuevoNodo;
            }
        }
    }

    // Método para intercambiar un nodo por otro buscado
    public boolean intercambiarNodos(String valor1, String valor2) {
        Nodo nodo1 = buscarPorValor(valor1);
        Nodo nodo2 = buscarPorValor(valor2);

        if (nodo1 != null && nodo2 != null) {
            // Intercambiar nodos
            Nodo tempAnterior1 = nodo1.anterior;
            Nodo tempSiguiente1 = nodo1.siguiente;
            nodo1.anterior = nodo2.anterior;
            nodo1.siguiente = nodo2.siguiente;
            nodo2.anterior = tempAnterior1;
            nodo2.siguiente = tempSiguiente1;

            if (tempAnterior1 != null) {
                tempAnterior1.siguiente = nodo2;
            } else {
                this.cabeza = nodo2;
            }

            if (tempSiguiente1 != null) {
                tempSiguiente1.anterior = nodo2;
            }

            return true;
        }
        return false;
    }

    // Método para buscar un nodo por el valor de su campo clave y devolver una
    // referencia
    private Nodo buscarPorValor(String valor) {
        Nodo temp = this.cabeza;
        while (temp != null && !temp.nombre.equals(valor)) {
            temp = temp.siguiente;
        }
        return temp;
}

// Método para imprimir la lista doblemente enlazada
public void i
