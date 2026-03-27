package poo;

public abstract class ClaseAbtracta {
    //las clases abtractan sirven como base de otras clases
    private int rueda;
    private String luces;
    private EnumColorEj color;
    public ClaseAbtracta(int rueda, String luces, String combustible, EnumColorEj color) {
        this.rueda = rueda;
        this.luces = luces;
        this.combustible = combustible;
        this.color = color;
    }

    public abstract int getRueda();

    public void setRueda(int rueda) {
        this.rueda = rueda;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    private String combustible;

    @Override
    public String toString() {
        return "Vehiculo{" +
                "rueda=" + rueda +
                ", luces='" + luces + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
