import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turnero {
    public static void main(String[] args) {
        List<String> clientes = leerDatos();
        Integer turnoMaximo = clientes.size();
        Integer turnoGanador = realizarSorteo(turnoMaximo);
        String ganador = mostrarGanador(turnoGanador, clientes);
        System.out.println(mostrarResultados(clientes, turnoGanador, ganador));
    }

    public static List<String> leerDatos() {
        List<String> clientes = new ArrayList<String>();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Ingrese el nombre del cliente o salir para terminar:");
                String nombre = sc.nextLine();
                if (nombre.equals("salir")) {
                    break;
                }
                clientes.add(nombre);
            }
            return clientes;
        } catch (Exception e) {
            throw new RuntimeException("Error al ingresar datos");
        }
    }

    public static Integer realizarSorteo(Integer turnoMaximo) {
        return (int) ((Math.random() * turnoMaximo) + 1);
    }

    public static String mostrarGanador(Integer turnoGanador, List<String> clientes) {
        return clientes.get(turnoGanador);
    }

    public static String mostrarResultados(List<String> clientes, Integer numeroSorteado, String ganador) {
        return """
                Resultados:
                Ganador: %s
                Numero sorteado: %d
                Clientes: %s
                """.formatted(ganador, numeroSorteado, clientes);
    }
}
