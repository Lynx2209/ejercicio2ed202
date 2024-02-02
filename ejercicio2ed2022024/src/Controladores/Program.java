package Controladores;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        // Crear una lista para almacenar los números
        List<Integer> numeros = new ArrayList<>();

        // Utilizar un conjunto para realizar un seguimiento de los números duplicados
        Set<Integer> duplicados = new HashSet<>();

        // Solicitar números al usuario hasta que escriba 0 o un número negativo
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Introduce un número entero (0 o negativo para salir): ");
                int numero = Integer.parseInt(scanner.nextLine());
                
                if (numero <= 0) {
                    break;
                }

                numeros.add(numero);

                // Si el número ya estaba en la lista, marcarlo como duplicado
                if (!duplicados.add(numero)) {
                    numeros.set(numeros.indexOf(numero), 0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número entero válido.");
            }
        }

        // Mostrar la lista original
        System.out.println("Lista original: " + numeros);

        // Mostrar la lista después de sustituir duplicados por 0
        System.out.println("Lista después de sustituir duplicados por 0: " + numeros);
    }
}
