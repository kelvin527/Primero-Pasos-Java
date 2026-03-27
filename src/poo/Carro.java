package poo;

public class Carro extends Vehiculo{
    // para hererdar de una clase se usa la palabra EXTENDES Y super inincializa las propiedades y metodos del padre
    //JAVA no tienen multi herencia
    private String marca;
    public Carro(int rueda, String luces, String combustible) {
        super(rueda, luces, combustible);

    }

    String g = super.toString();
    public static void jjj(){
        IO.println(",;pk;pklkl");
    }

}
