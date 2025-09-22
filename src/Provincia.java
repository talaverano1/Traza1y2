import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Provincia {
    private String nombre;
    private Set<Localidad> localidades = new HashSet<>();

    public Provincia() {
    }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLocalidad(Localidad localidad){
        localidades.add(localidad);
    }

    @Override
    public String toString(){
        return "Provincia[nombre: "+ nombre +"]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Provincia provincia = (Provincia) o;
        return Objects.equals(nombre, provincia.nombre) && Objects.equals(localidades, provincia.localidades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, localidades);
    }
}

