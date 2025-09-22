import java.util.Objects;

public class ArticuloManufacturadoDetalle {
    private long id;
    private int cantidad;
    private ArticuloInsumo insumo;

    public ArticuloManufacturadoDetalle(long id, int cantidad, ArticuloInsumo insumo) {
        this.id = id;
        this.cantidad = cantidad;
        this.insumo = insumo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloInsumo getInsumo() {
        return insumo;
    }

    public void setInsumo(ArticuloInsumo insumo) {
        this.insumo = insumo;
    }

    @Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        ArticuloManufacturadoDetalle that = (ArticuloManufacturadoDetalle) o;
        return id == that.id && cantidad == that.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidad);
    }
}
