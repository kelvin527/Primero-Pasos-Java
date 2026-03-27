package scaneerclase;

import java.util.Scanner;

public class Entrada_Teclado {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("dame el nuemro");
        int b = scanner.nextInt();

        IO.println(b);

        scanner.close();//SIMPRE SE DEBE CERRAR
    }
}
