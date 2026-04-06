package estructura_de_datos.dicionario;

public class HashMap {
        public static void main(String[] args) {

            //la diferencia entre HashMap y TreeMap es que TreeMap mantiene los elementos ordenados por sus claves, mientras que HashMap no
            // garantiza ningún orden específico. Además, TreeMap implementa la interfaz SortedMap,
            // lo que permite realizar operaciones de rango y obtener vistas ordenadas del mapa.
            java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>();

            // Agregar elementos al HashMap
            hashMap.put("Uno", 1);
            hashMap.put("Dos", 2);
            hashMap.put("Tres", 3);

            // Obtener un valor por su clave
            int valor = hashMap.get("Dos");
            System.out.println("Valor asociado a 'Dos': " + valor);

            // Verificar si una clave existe
            boolean existe = hashMap.containsKey("Tres");
            System.out.println("¿Existe la clave 'Tres'? " + existe);

            // Eliminar un elemento por su clave
            hashMap.remove("Uno");

            // Verificar el tamaño del HashMap
            int tamaño = hashMap.size();
            System.out.println("Tamaño del HashMap: " + tamaño);

            //Actualizar un valor asociado a una clave existente
            hashMap.put("Dos", 22);
            System.out.println("Valor actualizado asociado a 'Dos': " + hashMap.get("Dos"));
        }
}
