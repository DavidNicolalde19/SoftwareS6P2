public class AnalizadorProyecto {
    // Atributo
    private Modulo[] modulos;

    // Constructor
    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    // Paso 3: Listar los modulos
    public String listarModulos() {
        String lista = "";

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                lista += modulos[i].mostrarInformacion() + "\n";
            }
        }

        return lista;
    }

    // Paso 4: Contar modulos terminados
    public int contarTerminados() {
        int contador = 0;

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].isTerminado()) {
                contador++;
            }
        }

        return contador;
    }

    // Paso 5: Calcular progreso promedio
    public double calcularProgresoPromedio() {
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                suma += modulos[i].getProgreso();
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return (double) suma / contador;
    }

    // Paso 6: Buscar modulo por nombre
    public Modulo buscarModulo(String nombre) {

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null &&
                    modulos[i].getNombre().equals(nombre)) {
                return modulos[i];
            }
        }

        return null;
    }
}





