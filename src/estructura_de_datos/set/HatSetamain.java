package estructura_de_datos.set;
import java.util.*;

public class HatSetamain {
    private int id;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HatSetamain that = (HatSetamain) obj;
        // Aquí puedes comparar los atributos relevantes para determinar la igualdad
        return true; // Cambia esto según tus necesidades
    }

    @Override
    public int hashCode() {
        // Aquí puedes generar un hash code basado en los atributos relevantes
        return Objects.hash(id); // Cambia esto según tus necesidades
    }

    static void main() {
        // LOS HATSET SON UNA IMPLEMENTACION DE LA INTERFAZ SET, QUE NO PERMITE ELEMENTOS DUPLICADOS Y
        // NO GARANTIZA EL ORDEN DE LOS ELEMENTOS, SE USAN CUANDO NO NOS IMPORTA EL ORDEN DE LOS ELEMENTOS Y
        // QUEREMOS EVITAR DUPLICADOS
        Set<String> hatSet = new HashSet<>();

        hatSet.add("Manzana");
        hatSet.add("Banana");
        hatSet.add("Naranja");
        hatSet.add("Manzana"); // No se agregará porque ya existe

        System.out.println("Elementos en el HatSet:");
        for (String fruta : hatSet) {
            System.out.println(fruta);
        }

        System.out.println("¿Contiene 'Banana'? " + hatSet.contains("Banana")); // true
        System.out.println("¿Contiene 'Pera'? " + hatSet.contains("Pera")); // false

        hatSet.remove("Banana");
        System.out.println("¿Contiene 'Banana' después de eliminar? " + hatSet.contains("Banana")); // false

    }
}
