package poo;

public class Principal extends Carro {
    public Principal(int rueda, String luces, String combustible) {
        super(rueda, luces, combustible);
    }

    static void main() {

    Vehiculo v = new Vehiculo(4,"ga","led");

        IO.println( v.toString());
        //asi se hace un casteo para que tome otra forma
       // ((Carro)v).setRueda(5);

        //printVehiculo(v);

jjj();


    }

    public static void printVehiculo(Carro vehiculo){
        IO.println(vehiculo);
    }
}
