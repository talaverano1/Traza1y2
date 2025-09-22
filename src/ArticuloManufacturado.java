import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public ArticuloManufacturado(String denominacion, double precioVenta, long id, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta, id);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Set<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalles() {
        return articuloManufacturadoDetalles;
    }

    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        articuloManufacturadoDetalles.add(detalle);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", articuloManufacturadoDetalles=" + articuloManufacturadoDetalles +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", id=" + id +
                ", imagenes=" + imagenes +
                '}';
    }
}
