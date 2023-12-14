//Programacion de la lista
public class Lista extends Nodo{
    private Nodo top;
    private Nodo back;

    Lista() { 
        top = null;
        back = null;
    }
    
    //Creacion de la lista(agregar)
    public void agg(int dato) {
        Nodo temp = new Nodo();
        temp.dato = dato;
        if (top == null) {
            top = temp;
            back = temp;
        } else {
            temp.next = top;
            top.prev = temp;
            top = temp;
        }
    }
    //Este metodo es para sobreescribir el metodo en java
    //El override es para sobreescribir un metodo que ya existe
    @Override
    public String toString(){
        String x = "";
        Nodo temp = top;
        while(temp!=null){
            x = (x +temp.dato)+", ";
            temp = temp.next;
        }
        return x;
        //x devuelve todos los valores de la lista y se devuelven y main
    }
    //Metodo Para Buscar(1)
    public Nodo buscar(int dato)
    {
        Nodo temp = top;
        while (temp != null){
            if(temp.dato == dato)
            {
                return temp;
            }
            temp = temp.next; 
        }
        
        return temp;
    }
    //Para agg dps
    //Metodo para agregar despues(2)
    public void aggdps(int buscar, int dato) throws Exception {
        Nodo temp = new Nodo();
        temp.dato = dato;
        Nodo temp2 = this.buscar(buscar);
        if (temp2 == null){
            throw new Exception("No existe el nodo en buscar");
        }
        temp.next = temp2.next;
        //Enlaze doble 
        temp2.next.prev = temp;
        temp2.next = temp;
        temp.prev = temp2;
    }
    //Metodo para intercambiar los nodos(3)
    public void cambio(int dato1, int dato2){
        int datoA;
        Nodo temp1 = this.buscar(dato1);
        Nodo temp2 = this.buscar(dato2);
        datoA = temp1.dato;
        temp1.dato = temp2.dato;
        temp2.dato = datoA;
    }
}
