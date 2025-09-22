import java.util.HashSet;
import java.util.Set;

public class ArticuloInsumo extends Articulo{
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public ArticuloInsumo(String denominacion, double precioVenta, long id, double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta, id);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public boolean isEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }

    public Set<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalles() {
        return articuloManufacturadoDetalles;
    }

    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        articuloManufacturadoDetalles.add(detalle);
    }

    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                "precioCompra=" + precioCompra +
                ", stockActual=" + stockActual +
                ", stockMaximo=" + stockMaximo +
                ", esParaElaborar=" + esParaElaborar +
                ", articuloManufacturadoDetalles=" + articuloManufacturadoDetalles +
                ", id=" + id +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", imagenes=" + imagenes +
                '}';
    }
}
