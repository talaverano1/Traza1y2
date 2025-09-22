import java.util.Objects;

public class Imagen {
    private String denominacion;
    private long id;

    public Imagen(String denominacion, long id) {
        this.denominacion = denominacion;
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "denominacion='" + denominacion + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Imagen imagen = (Imagen) o;
        return id == imagen.id && Objects.equals(denominacion, imagen.denominacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominacion, id);
    }
}
