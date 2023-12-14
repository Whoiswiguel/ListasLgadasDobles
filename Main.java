public class Main extends Lista{
    
public static void main(String[] args) throws Exception {
    //Creacion de la lista 
    Lista lista1 = new Lista();
    //Agregar nodos a la lista
    lista1.agg(1);
    lista1.agg(2);
    lista1.agg(3);
    lista1.agg(4);
    System.out.println("Lista");
    System.out.println(lista1);
    System.out.println("Se utiliza el metodo buscar y se agrega a la derecha");
    lista1.aggdps(2,5);
    System.out.println(lista1);
     System.out.println("Cambiar 4 y 5 de lugar");
    lista1.cambio(5,4);
    System.out.println(lista1);

    }
}
