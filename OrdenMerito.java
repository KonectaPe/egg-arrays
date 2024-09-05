import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenMerito {
    public static void main(String[] args) {
        List<Integer> ordenMerito = new ArrayList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Ingresa un numero entero entre 1 y 10 o 0 para terminar:");
                int numero = sc.nextInt();
                if (numero == 0) {
                    break;
                }
                if (numero < 1 || numero > 10) {
                    System.out.println("El numero ingresado no es valido");
                    continue;
                }
                ordenMerito.add(numero);
            }
            ordenMerito.sort(Comparator.naturalOrder());
            System.out.println("El orden de merito en ascendente es: " + ordenMerito.toString());
            ordenMerito.sort(Comparator.reverseOrder());
            System.out.println("El orden de merito en descendente es: " + ordenMerito.toString());
        } catch (Exception e) {
            throw new RuntimeException("Error al ingresar datos");
        }
    }
}
