package estructura_de_datos.set;
import java.util.*;
public class LinkedHashSetExamp {
    static void main() {
        // LOS LINKEDHASHSET SON UNA IMPLEMENTACION DE LA INTERFAZ SET, QUE NO PERMITE ELEMENTOS DUPLICADOS Y
        // GARANTIZA EL ORDEN DE LOS ELEMENTOS, SE USAN CUANDO QUEREMOS EVITAR DUPLICADOS Y MANTENER EL ORDEN DE LOS ELEMENTOS

            Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Manzana");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Naranja");
        linkedHashSet.add("Manzana"); // No se agregará porque ya existe

    }
}
