package estructura_de_datos.iteradores;
import java.util.*;
public class ListIteractorExamp {
    // Un iterador es un objeto que permite recorrer una colección de elementos, como una lista o un conjunto,
    // sin exponer la estructura interna de la colección. Proporciona métodos para acceder a
    // los elementos de la colección de manera secuencial y para realizar operaciones como eliminar elementos durante la iteración.

        public static void main(String[] args) {
        List<String> lista = new java.util.ArrayList<>();
            lista.add("Elemento 1");
            lista.add("Elemento 2");
            lista.add("Elemento 3");

            // Un ListIterator es una interfaz que extiende la interfaz Iterator y proporciona métodos adicionales para recorrer una
            // lista en ambas direcciones (hacia adelante y hacia atrás) y para modificar la lista durante la iteración.
                ListIterator<String> iterador =  lista.listIterator();

            while (iterador.hasNext()) {
                String elemento = iterador.next();
                System.out.println(elemento);
                    if(elemento.startsWith("E")) {
                        iterador.remove(); // Eliminar el elemento si cumple la condición
                    }

                    //add agrega un elemento a la lista en la posición actual del iterador, es decir, antes del próximo elemento que se devolverá con next()
                    if(elemento.equals("Elemento 2")) {
                        iterador.add("Nuevo Elemento"); // Agregar un nuevo elemento después de "Elemento

            }
                    //actualiza el último elemento devuelto por next() o previous() con el
                // nuevo valor proporcionado. No se puede usar update() sin haber llamado a next() o previous()
                // al menos una vez, ya que no hay un elemento actual para actualizar.
                    if(elemento.equals("Elemento 3")) {
                        iterador.set("Elemento 3 Actualizado"); // Actualizar el valor de "Elemento
        }    }
            System.out.println("Lista después de la iteración: " + lista);
        }
}
