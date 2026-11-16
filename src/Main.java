
public class Main {

    public static void main(String[] args) {

        Modulo[] modulos = new Modulo[5];

        modulos[0] = new Modulo("Autenticacion", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Ventas", "Python", 80, false);
        modulos[3] = new Modulo("Usuarios", "Java", 100, true);
        modulos[4] = new Modulo("Reportes", "Python", 50, false);

        AnalizadorProyecto analizador =
                new AnalizadorProyecto(modulos);

        System.out.println("LISTA DE MODULOS:");
        System.out.println(analizador.listarModulos());

        System.out.println("Modulos terminados: "
                + analizador.contarTerminados());

        System.out.println("Progreso promedio: "
                + analizador.calcularProgresoPromedio() + "%");

        Modulo encontrado =
                analizador.buscarModulo("Autenticacion");

        if (encontrado != null) {
            System.out.println("Modulo encontrado:");
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Modulo no encontrado");
        }

        Modulo inexistente =
                analizador.buscarModulo("Diseño");

        if (inexistente == null) {
            System.out.println("El modulo Diseño no existe");
        }
    }
}

