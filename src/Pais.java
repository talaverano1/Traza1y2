import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pais {
    private final String nombre;
    private Set<Provincia> provincias = new HashSet<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProvincia(Provincia provincia){
        provincias.add(provincia);
    }

    @Override
    public String toString(){
        return "Pais[nombre: "+ nombre +"]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre) && Objects.equals(provincias, pais.provincias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, provincias);
    }
}
