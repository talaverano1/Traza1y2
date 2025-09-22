import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UnidadMedida {
    private String denominacion;
    private long id;
    private Set<Articulo> articulos = new HashSet<>();

    public UnidadMedida(String denominacion, long id) {
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

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    @Override
    public String toString() {
        return "UnidadMedida{" +
                "denominacion='" + denominacion + '\'' +
                ", id=" + id +
                ", articulos=" + articulos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UnidadMedida that = (UnidadMedida) o;
        return id == that.id && Objects.equals(denominacion, that.denominacion) && Objects.equals(articulos, that.articulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominacion, id, articulos);
    }
}
