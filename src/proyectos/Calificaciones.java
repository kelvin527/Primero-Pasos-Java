package proyectos;

import java.util.Scanner;

public class Calificaciones {
    //COMANDO PARA GENENRAR LOS SET Y GET Y CONSTRUCTOR: ALT + INSERT
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    int n;
    static void main() {
        IO.println("------Bienvenido------");
        Scanner scanner = new Scanner(System.in);
        IO.println("Ingresa tu edad.");
      int edad =  scanner.nextInt();

        double calificaciones = 0 ;
       final int PROMEDIO = 3;

        for (int i = 1;i <=3;i++){
            IO.println("Ingrese la calificacion " + i);
            double puntos = scanner.nextDouble();
            calificaciones += puntos;
        }
        double totalCalificacion = calificaciones / PROMEDIO;

      if (totalCalificacion > 70 && totalCalificacion < 79){
          IO.println("Aprobado con: " + totalCalificacion);
      }
      else if (totalCalificacion > 80 && totalCalificacion < 89){
            IO.println("Aprobado con: " + totalCalificacion);
        }
      else if (totalCalificacion > 90 && totalCalificacion < 99){
          IO.println("Aprobado con: " + totalCalificacion);
      }
      else {
          IO.println("No aprobado con:" + totalCalificacion);
      }
    }
}
