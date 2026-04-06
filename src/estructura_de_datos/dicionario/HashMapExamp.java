package estructura_de_datos.dicionario;
import java.util.HashMap;
public class HashMapExamp {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

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
    }
}
