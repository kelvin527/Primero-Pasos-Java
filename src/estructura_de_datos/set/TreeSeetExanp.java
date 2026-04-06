package estructura_de_datos.set;
import java.util.*;
public class TreeSeetExanp {
    static void main() {
        // LOS TREESET SON UNA IMPLEMENTACION DE LA INTERFAZ SET, QUE NO PERMITE ELEMENTOS DUPLICADOS Y
        // ALMACENA LOS ELEMENTOS EN ORDEN NATURAL (ORDEN ASCENDENTE) O SEGUN UN COMPARATOR PROPORCIONADO
        // SE USAN CUANDO QUEREMOS EVITAR DUPLICADOS Y MANTENER LOS ELEMENTOS ORDENADOS
        //SON MUY EFICIENTES PARA BUSQUEDAS, INSERCIONES Y ELIMINACIONES, PERO SON MAS LENTOS QUE LOS HATSET Y LINKEDHASHSET
        /*LOS TREESET TIENEN UN PNTO DE PARTIDA Y que USA ARBOL*/
           Set<String> treeSet = new java.util.TreeSet<>();


    }
    // Si queremos ordenar por un criterio diferente al orden natural, podemos usar un Comparator personalizado
    public class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Comparar por longitud de la cadena
            return Integer.compare(s1.length(), s2.length());
        }
    }
}
