import java.util.Objects;

public class Domicilio {
    private String calle;
    private int numero;
    private int cp;


    public Domicilio() {
    }

    public Domicilio(String calle, int numero, int cp) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;

    }

    @Override
    public String toString(){
        return "Domicilio[calle: "+ calle +", numero: "+ numero +", ]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Domicilio domicilio = (Domicilio) o;
        return numero == domicilio.numero && cp == domicilio.cp && Objects.equals(calle, domicilio.calle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, numero, cp);
    }
}