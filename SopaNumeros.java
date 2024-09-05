import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SopaNumeros {
    public static void main(String[] args) {
        List<Integer> valores = leerValores();
        Integer suma = sumarValores(valores);
        Double promedio = calcularPromedio(valores.size(), suma);
        List<Integer> media = calcularMedia(valores, promedio);
        System.out.println(mostrarResultados(valores, suma, promedio, media));
    }

    public static List<Integer> leerValores() {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> sopaNumeros = new ArrayList<Integer>();
            while (true) {
                System.out.println("Ingrese un número 0 -99 para terminar:");
                int numero = sc.nextInt();
                if (numero == -99) {
                    break;
                }
                sopaNumeros.add(numero);
            }
            return sopaNumeros;
        } catch (Exception e) {
            throw new RuntimeException("Error al ingresar datos");
        }
    }

    public static Integer sumarValores(List<Integer> sopaNumeros) {
        Integer suma = 0;
        for (Integer numero : sopaNumeros) {
            suma += numero;
        }
        return suma;
    }

    public static Double calcularPromedio(Integer tamaño, Integer suma) {
        return (double) suma / tamaño;
    }

    public static List<Integer> calcularMedia(List<Integer> sopaNumeros, Double promedio) {
        List<Integer> media = new ArrayList<Integer>();
        for (Integer numero : sopaNumeros) {
            if (numero > promedio) {
                media.add(numero);
            }
        }
        return media;
    }

    public static String mostrarResultados(List<Integer> valores, Integer suma, Double promedio, List<Integer> media) {
        return """
                Resultados:
                Valores ingresados -> %s
                Suma -> %d
                Promedio -> %.2f
                Media -> %s
                """.formatted(valores.toString(), suma, promedio, media.toString());
    }
}
