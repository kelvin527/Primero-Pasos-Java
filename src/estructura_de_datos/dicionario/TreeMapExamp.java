package estructura_de_datos.dicionario;

public class TreeMapExamp {
        public static void main(String[] args) {

            //la diferencia entre HashMap y TreeMap es que TreeMap mantiene los elementos ordenados por sus claves, mientras que HashMap no
            // garantiza ningún orden específico. Además, TreeMap implementa la interfaz SortedMap,
            // lo que permite realizar operaciones de rango y obtener vistas ordenadas del mapa.
            java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();

            // Agregar elementos al TreeMap
            treeMap.put("Uno", 1);
            treeMap.put("Dos", 2);
            treeMap.put("Tres", 3);

            // Obtener un valor por su clave
            int valor = treeMap.get("Dos");
            System.out.println("Valor asociado a 'Dos': " + valor);

            // Verificar si una clave existe
            boolean existe = treeMap.containsKey("Tres");
            System.out.println("¿Existe la clave 'Tres'? " + existe);

            // Eliminar un elemento por su clave
            treeMap.remove("Uno");

            // Verificar el tamaño del TreeMap
            int tamaño = treeMap.size();
            System.out.println("Tamaño del TreeMap: " + tamaño);

            //Actualizar un valor asociado a una clave existente
            treeMap.put("Dos", 22);
            System.out.println("Valor actualizado asociado a 'Dos': " + treeMap.get("Dos"));
        }
}
