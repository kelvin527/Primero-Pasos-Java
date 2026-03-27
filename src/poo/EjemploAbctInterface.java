package poo;

public class EjemploAbctInterface extends ClaseAbtracta implements Electric{
    private int bateryLavel;
    private EnumColorEj color;

    public EjemploAbctInterface(int rueda, String luces, String combustible, int bateryLavel, EnumColorEj color) {
        super(rueda, luces, combustible,color);
        this.bateryLavel = bateryLavel;
        this.color = color;
    }

    @Override
    public int getRueda() {
        return 0;
    }

    @Override
    public void chagen() {
    this.bateryLavel = LEVEL;
        IO.println("level es" + this.bateryLavel);
    }

    //clases anomima: son CLASES SIN NOMBRE QUE SE DECLARA E INSTANCIA EN UNA SOLA LINEA, SIRVE PARA SOBRE ESCRIBIR METODOS DE UNA INTERFAZ O UNA CLASE ABTRAC

    ClaseAbtracta ejepl = new ClaseAbtracta(8,"led","gasoil",color.ROJO) {
        @Override
        public int getRueda() {
            return 0;
        }
    } ;
}
