import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean es_Casa_Matriz;
    private Domicilio domicilio;
    private Set<Articulo> articulos = new HashSet<>();

    public Sucursal() {
    }

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, boolean es_Casa_Matriz, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.es_Casa_Matriz = es_Casa_Matriz;
        this.domicilio = domicilio;
    }

    public void agregarArticulo (Articulo articulo){
        articulos.add(articulo);
    }

    @Override
    public String toString(){
        return "Sucursal[nombre: "+ nombre +", horario de apertura: "+ horarioApertura +", horario de cierre: "+ horarioCierre +",]"+ domicilio ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sucursal sucursal = (Sucursal) o;
        return es_Casa_Matriz == sucursal.es_Casa_Matriz && Objects.equals(nombre, sucursal.nombre) && Objects.equals(horarioApertura, sucursal.horarioApertura) && Objects.equals(horarioCierre, sucursal.horarioCierre) && Objects.equals(domicilio, sucursal.domicilio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, horarioApertura, horarioCierre, es_Casa_Matriz, domicilio);
    }
}