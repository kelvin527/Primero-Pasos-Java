package clase_static;

public class Bloque_Static {

    /*LOS BLOQUES STATIC SE USAN PARA CARGAR CONFIGURACIONES, YA QUE SE EJECUTAN PIMERO QUE LAS CLASES
    * POR QUE LO HACEN EN MEMORIA. ASI PODRE TENER LA CONFIGUCION O SERVICIOS EXTERNOS LISTO CUANDO INICIE EL SISTEMA
    * Y SE CARGUEN TODAS LA CLASES Y METODOS
    * */

    static final String URL;
    static final String USER;

    static {
        URL = "https://cursos.devtalles.com/courses/take/Java/lessons/67932209-bloque-static";
        USER = "ADM";
        IO.println("Configuracion cargada...");
    }
    static void main() {
        IO.println(USER);
        IO.println(URL);
    }
}
