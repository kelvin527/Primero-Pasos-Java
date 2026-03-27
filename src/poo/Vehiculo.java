package poo;

public class Vehiculo {
    private int rueda;
    private String luces;

    public Vehiculo(int rueda, String luces, String combustible) {
        this.rueda = rueda;
        this.luces = luces;
        this.combustible = combustible;
    }

    public int getRueda() {
        return rueda;
    }

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
