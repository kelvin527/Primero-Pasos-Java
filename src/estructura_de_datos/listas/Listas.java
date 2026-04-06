package estructura_de_datos.listas;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Listas {
    /*LAS LISTAS SON DINAMICAS, SE PUEDEN AGREGAR O ELIMINAR ELEMENTOS, SE USAN CUANDO NO SABEMOS LA CANTIDAD DE ELEMENTOS QUE VAMOS A USAR
     * Y PUEDEN SER DE TIPO DE DATOS PRIMITIVOS O OBJETOS, POR ENDE SI PODEMOS USAR METODOS*/
     static void main() {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (int numero: numeros) {
            System.out.println(numero);
        }
         numeros.get(0); // Devuelve el primer elemento de la lista
         numeros.size(); // Devuelve el tamaño de la lista
         numeros.remove(0); // Elimina el primer elemento de la lista
         numeros.set(0, 10); // Cambia el valor del primer elemento de la lista a 10
         numeros.contains(10); // Devuelve true si la lista contiene el elemento 10
        numeros.removeFirst(); // Elimina el primer elemento de la lista
         numeros.removeLast(); // Elimina el último elemento de la lista
         numeros.getFirst(); // Devuelve el primer elemento de la lista
         numeros.getLast(); // Devuelve el último elemento de la lista

         /* linked list es una lista enlazada, es decir, cada elemento tiene un puntero al
         siguiente elemento, lo que permite una inserción y eliminación más rápida, pero un acceso más lento a los elementos.
          *///usan los mismo metodo que array list pero con diferente implementacion
         List<String> clientes = new LinkedList<>();
            clientes.add("Juan");
            clientes.add("Maria");
            clientes.add("Pedro");
        clientes.addFirst("Ana"); // Agrega un elemento al principio de la lista
       clientes.addLast("Luis"); // Agrega un elemento al final de la lista
        clientes.removeFirst(); // Elimina el primer elemento de la lista
         clientes.removeLast(); // Elimina el último elemento de la lista
        clientes.getFirst(); // Devuelve el primer elemento de la lista
        clientes.getLast(); // Devuelve el último elemento de la lista


     }
}
