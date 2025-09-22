import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Empresa {
    private int Id;
    private String nombre;
    private String razonSocial;
    private int cuit;
    private String logo;
    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa() {
    }

    public Empresa( int Id,String nombre, String razonSocial, int cuit, String logo) {
        this.Id = Id;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.logo = logo;
    }

    public void agregarSucursal (Sucursal sucursal){
        sucursales.add(sucursal);
    }

    public void MostrarEmepresas(){

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString(){
        return "Empresa[Id: "+ Id +", nombre: "+ nombre +", razon social: "+ razonSocial +", cuit: "+ cuit +", logo: "+ logo +"]" ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return cuit == empresa.cuit && Objects.equals(nombre, empresa.nombre) && Objects.equals(razonSocial, empresa.razonSocial) && Objects.equals(logo, empresa.logo) && Objects.equals(sucursales, empresa.sucursales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, razonSocial, cuit, logo, sucursales);
    }
}
