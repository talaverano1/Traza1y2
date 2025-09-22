import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Categoria {
    private long id;
    private String denominacion;
    private Set<Articulo> articulos = new HashSet<>();

    public Categoria(long id, String denominacion) {
        this.id = id;
        this.denominacion = denominacion;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }


    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", denominacion='" + denominacion + '\'' +
                ", articulos=" + articulos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return id == categoria.id && Objects.equals(denominacion, categoria.denominacion) && Objects.equals(articulos, categoria.articulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, denominacion, articulos);
    }
}
