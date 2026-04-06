package estructura_de_datos.listas;

public class Arreglos {
    /*LOS ARREGLOS NO DINAMICO SE USAN CUANDO SABEMOS LA CANTIDAD DE ELEMENTOS QUE VAMOS A USAR
    * Y SIN DE TIPO DE DATOS PRIMITIVOS, POR ENDE NO PODEMOS USAR METODOS*/
    static void main() {
        int number = 10;
        int[] numero = new int[number];

        numero[0] = 1;

        for (int knumero: numero) {
            System.out.println(numero);
        }
    }

}
