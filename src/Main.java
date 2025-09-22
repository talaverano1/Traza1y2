import java.time.LocalTime;
import java.util.*;

public class Main {
    private static Set<Empresa> empresas = new HashSet<>();

    public static void mostrarEmpresas(){
        empresas.forEach(System.out::println);
    }

    public static void agregarEmpresa(Empresa empresa){
        empresas.add(empresa);
    }

    public static Empresa buscarEmpresa(int id){
        for(Empresa e : empresas){
            if (e.getId()== id){
                return e;
            }
        }
        return null;
    }

    public static Empresa buscarEmpresa2(String nombre){
        for(Empresa e : empresas){
            if (e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
        }
        return null;
    }

    public static boolean actualizarCuit(int id, int nuevoCuit) {
        Empresa e = buscarEmpresa(id);
        if (e != null) {
            e.setCuit(nuevoCuit);
            return true;
        }
        return false;
    }

    public static boolean eliminarEmpresa(int id) {
        return empresas.removeIf(e -> e.getId() == id);
    }

    public static void main(String[] args) {
        //Traza 2
        Scanner sc = new Scanner(System.in);

        Categoria pizzas = new Categoria(1, "Pizzas");
        Categoria lomos = new Categoria(2, "Lomos");
        Categoria sandwich = new Categoria(3, "Sandwich");
        Categoria insumos = new Categoria(4, "Insumos");

        UnidadMedida kg = new UnidadMedida("Kilogramos", 1);
        UnidadMedida litros = new UnidadMedida("Litros", 2);
        UnidadMedida gramos = new UnidadMedida("Gramos", 3);

        ArticuloInsumo sal = new ArticuloInsumo("Sal", 10, 1, 5, 100, 500, true);
        ArticuloInsumo aceite = new ArticuloInsumo("Aceite", 50, 2, 30, 50, 200, true);
        ArticuloInsumo carne = new ArticuloInsumo("Carne", 500, 3, 300, 20, 100, true);
        ArticuloInsumo harina = new ArticuloInsumo("Harina", 100, 4, 60, 200, 1000, true);

        insumos.addArticulo(sal);
        insumos.addArticulo(aceite);
        insumos.addArticulo(carne);
        insumos.addArticulo(harina);

        Imagen img1 = new Imagen("imagen1", 1);
        Imagen img2 = new Imagen("imagen2", 2);
        Imagen img3 = new Imagen("imagen3", 3);
        Imagen img4 = new Imagen("imagen4", 4);
        Imagen img5 = new Imagen("imagen5", 5);
        Imagen img6 = new Imagen("imagen6", 6);

        ArticuloManufacturadoDetalle detallePizza1 = new ArticuloManufacturadoDetalle(1, 1, sal);
        ArticuloManufacturadoDetalle detallePizza2 = new ArticuloManufacturadoDetalle(2, 2, harina);
        ArticuloManufacturadoDetalle detallePizza3 = new ArticuloManufacturadoDetalle(3, 1, aceite);

        ArticuloManufacturadoDetalle detalleLomo1 = new ArticuloManufacturadoDetalle(4, 1, sal);
        ArticuloManufacturadoDetalle detalleLomo2 = new ArticuloManufacturadoDetalle(5, 1, aceite);
        ArticuloManufacturadoDetalle detalleLomo3 = new ArticuloManufacturadoDetalle(6, 1, carne);

        ArticuloManufacturado pizzaHawaina = new ArticuloManufacturado("Pizza Hawaina", 1500, 10,
                "Pizza con jamón, queso y ananá", 30, "Hornear por 20 minutos");
        pizzaHawaina.addImagen(img1);
        pizzaHawaina.addImagen(img2);
        pizzaHawaina.addImagen(img3);
        pizzaHawaina.addDetalle(detallePizza1);
        pizzaHawaina.addDetalle(detallePizza2);
        pizzaHawaina.addDetalle(detallePizza3);

        pizzas.addArticulo(pizzaHawaina);

        ArticuloManufacturado lomoCompleto = new ArticuloManufacturado("Lomo Completo", 2000, 20,
                "Lomo completo con huevo, jamón y queso", 25, "Plancha y armado en pan");
        lomoCompleto.addImagen(img4);
        lomoCompleto.addImagen(img5);
        lomoCompleto.addImagen(img6);
        lomoCompleto.addDetalle(detalleLomo1);
        lomoCompleto.addDetalle(detalleLomo2);
        lomoCompleto.addDetalle(detalleLomo3);

        lomos.addArticulo(lomoCompleto);

        Map<Long, ArticuloManufacturado> manufacturados = new HashMap<>();
        manufacturados.put(pizzaHawaina.getId(), pizzaHawaina);
        manufacturados.put(lomoCompleto.getId(), lomoCompleto);

        System.out.println("Categorías:");
        System.out.println(pizzas);
        System.out.println(lomos);
        System.out.println(sandwich);
        System.out.println(insumos);

        System.out.println("Insumos:");
        for (Articulo a : insumos.getArticulos()) {
            System.out.println(a);
        }

        System.out.println("Artículos manufacturados:");
        for (ArticuloManufacturado am : manufacturados.values()) {
            System.out.println(am);
        }

        System.out.println("Buscar manufacturado por ID");
        long idBuscar = sc.nextLong();
        ArticuloManufacturado buscado = manufacturados.get(idBuscar);
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado);
        } else {
            System.out.println("No existe un manufacturado con ese ID.");
        }

        System.out.println("Actualizar manufacturado por ID");
        long idActualizar = sc.nextLong();
        ArticuloManufacturado actualizar = manufacturados.get(idActualizar);
        if (actualizar != null) {
            System.out.print("Nuevo precio: ");
            double nuevoPrecio = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
            System.out.print("Nueva descripción: ");
            String nuevaDescripcion  = sc.nextLine();

            actualizar.setPrecioVenta(nuevoPrecio);
            actualizar.setDescripcion(nuevaDescripcion);

            System.out.println("Actualizado: " + actualizar);
        } else {
            System.out.println("No existe un manufacturado con ese ID.");
        }

        System.out.println("Eliminar manufacturado por ID");

        long idEliminar = sc.nextLong();
        ArticuloManufacturado eliminado = manufacturados.remove(idEliminar);
        if (eliminado != null) {
            System.out.println("Eliminado: " + eliminado);
        } else {
            System.out.println("No existe un manufacturado con ese ID.");
        }

        System.out.println("Resultado de cambios:");
        for (ArticuloManufacturado am : manufacturados.values()) {
            System.out.println(am);
        }

        //Traza 1
        System.out.println("-------Traza 1-------");

        Pais Argentina = new Pais("Argentina");

        Provincia BA = new Provincia("Buenos Aires");
        Argentina.agregarProvincia(BA);

        Localidad Caba = new Localidad("Caba");
        BA.agregarLocalidad(Caba);
        Domicilio domicilio1 = new Domicilio("San Martin",234,123);
        Caba.agregarDomicilio(domicilio1);
        Sucursal sucursal1 = new Sucursal("Sucursal Caba", LocalTime.of(7, 0),LocalTime.of(19, 0),true,domicilio1);

        Localidad LaPlata = new Localidad("La Plata");
        BA.agregarLocalidad(LaPlata);
        Domicilio domicilio2 = new Domicilio("Villanueva",567,90);
        LaPlata.agregarDomicilio(domicilio2);
        Sucursal sucursal2 = new Sucursal("Sucursal La Plata",LocalTime.of(7, 0),LocalTime.of(19, 0),true,domicilio2);

        Provincia Cordoba = new Provincia("Cordoba");

        Argentina.agregarProvincia(Cordoba);
        Localidad CordobaC= new Localidad("Cordoba Capital");
        Cordoba.agregarLocalidad(CordobaC);
        Domicilio domicilio3 = new Domicilio("Dr Juan Cruz",321,5);
        CordobaC.agregarDomicilio(domicilio3);
        Sucursal sucursal3 = new Sucursal("Sucursal Cordoba Capital",LocalTime.of(7, 0),LocalTime.of(19, 0),true,domicilio3);

        Localidad VillaCarlosPaz= new Localidad("Villa Carlos Paz");
        Cordoba.agregarLocalidad(VillaCarlosPaz);
        Domicilio domicilio4 = new Domicilio("Belgrano",144,2);
        VillaCarlosPaz.agregarDomicilio(domicilio4);
        Sucursal sucursal4 = new Sucursal("Sucursal Villa Carlos Paz",LocalTime.of(7, 0),LocalTime.of(19, 0),true,domicilio4);

        Empresa empresa1 = new Empresa(1,"Talca", "esto",232323,"T");
        agregarEmpresa(empresa1);
        empresa1.agregarSucursal(sucursal1);
        empresa1.agregarSucursal(sucursal2);
        Empresa empresa2 = new Empresa(2,"Fanta", "aquello",898989,"F");
        agregarEmpresa(empresa2);
        empresa2.agregarSucursal(sucursal3);
        empresa2.agregarSucursal(sucursal4);

        mostrarEmpresas();

        System.out.println("A que empresa quiere acceder (ID)");
        Scanner scanner = new Scanner(System.in);
        int idBuscado = scanner.nextInt();
        scanner.nextLine();
        Empresa encontrada = buscarEmpresa(idBuscado);

        if (encontrada != null) {
            System.out.println("Empresa encontrada: " + encontrada);
        } else {
            System.out.println("No se encontró una empresa con ese id " + idBuscado);
        }

        System.out.println("A que empresa quiere acceder (Nombre)");
        String nombreBuscado = scanner.nextLine();

        Empresa encontrada2 = buscarEmpresa2(nombreBuscado);
        if (encontrada2 != null) {
            System.out.println("Empresa encontrada: " + encontrada2);
        } else {
            System.out.println("No se encontró una empresa con ese nombre" + nombreBuscado);
        }

        System.out.println("Ingrese el id de la empresa a actualizar:");
        int idActualizarE = scanner.nextInt();
        System.out.println("Ingrese el nuevo CUIT:");
        int nuevoCuit = scanner.nextInt();

        if (actualizarCuit(idActualizarE, nuevoCuit)) {
            System.out.println("CUIT actualizado correctamente.");
        } else {
            System.out.println("No se encontró la empresa con id " + idActualizarE);
        }

        mostrarEmpresas();
        System.out.println("Ingrese el id de la empresa a eliminar:");
        int idEliminarE = scanner.nextInt();

        if (eliminarEmpresa(idEliminarE)) {
            System.out.println("Empresa eliminada correctamente.");
        } else {
            System.out.println("No se encontró la empresa con id " + idEliminarE);
        }



        mostrarEmpresas();
    }
}