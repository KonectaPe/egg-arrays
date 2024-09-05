import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCiudades {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<String>();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Ingrese una ciudad o 'salir' para terminar:");
                String ciudad = sc.nextLine();
                if (ciudad.equals("salir")) {
                    break;
                }
                ciudades.add(ciudad);
            }
            System.out.println("Las ciudades ingresadas son:" + ciudades.toString());
        } catch(Exception e) {
            throw new RuntimeException("Error al ingresar datos"); 
        }
    }
}