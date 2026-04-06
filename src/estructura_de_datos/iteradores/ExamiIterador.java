package estructura_de_datos.iteradores;

public class ExamiIterador {
    // Un iterador es un objeto que permite recorrer una
    // colección de elementos, como una lista o un conjunto, sin exponer la estructura interna de la
    // colección. Proporciona métodos para acceder a los elementos de la colección de manera secuencial y para realizar
    // operaciones como eliminar elementos durante la iteración.

        public static void main(String[] args) {
            java.util.List<String> lista = new java.util.ArrayList<>();
            lista.add("Elemento 1");
            lista.add("Elemento 2");
            lista.add("Elemento 3");

            java.util.Iterator<String> iterador = lista.iterator();
//              eSTO DA ERROR PORQUE SE ESTA MODIFICANDO LA LISTA MIENTRAS SE ESTA ITERANDO SOBRE ELLA
               //SOLO SIRVE PARA RECORRER LA LISTA, NO PARA MODIFICARLA
//            for (String elemento : lista) {
//              if(elemento.startsWith("E")) {
//                    lista.remove(elemento); // Esto puede causar ConcurrentModificationException
//                }
//                System.out.println(elemento);
//            }

            // Para evitar el error, se debe usar el método remove() del iterador en lugar de modificar la lista directamente
            while (iterador.hasNext()) {
                String elemento = iterador.next();
                if(elemento.startsWith("E")) {
                    iterador.remove(); // Eliminar el elemento si cumple la condición
                }
                System.out.println(elemento);
            }
        }
}
