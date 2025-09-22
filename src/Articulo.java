import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Articulo {
    protected String denominacion;
    protected double precioVenta;
    protected long id;
    protected Set<Imagen> imagenes = new HashSet<>();

    public Articulo() {
    }

    public Articulo(String denominacion, double precioVenta, long id) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void addImagen(Imagen img) {
        imagenes.add(img);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", id=" + id +
                ", imagenes=" + imagenes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Double.compare(precioVenta, articulo.precioVenta) == 0 && id == articulo.id && Objects.equals(denominacion, articulo.denominacion) && Objects.equals(imagenes, articulo.imagenes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominacion, precioVenta, id, imagenes);
    }
}
