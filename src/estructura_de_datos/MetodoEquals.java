package estructura_de_datos;

public class MetodoEquals {
    static void main() {
        String str1 = new String("Hola");
        String str2 = new String("Hola");

        // Comparar con == (compara referencias)
        System.out.println("Comparación con ==: " + (str1 == str2)); // false

        // Comparar con equals (compara contenido)
        System.out.println("Comparación con equals: " + str1.equals(str2)); // true
    }
}
