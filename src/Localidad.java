import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Localidad {
    private String nombre;
    private Set<Domicilio> domicilios = new HashSet<>();

    public Localidad() {
    }

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDomicilio (Domicilio domicilio){
        domicilios.add(domicilio);
    }

    @Override
    public String toString(){
        return "Localidad[nombre: "+ nombre +"]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Localidad localidad = (Localidad) o;
        return Objects.equals(nombre, localidad.nombre) && Objects.equals(domicilios, localidad.domicilios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, domicilios);
    }
}
