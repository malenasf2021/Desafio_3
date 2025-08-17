package Desafio_3;
import java.util.Random;

public class Desafio_3 {

    public static void main(String[] args) {
        // Crea un objeto de la clase Random para generar números aleatorios.
        Random random = new Random();
        
        // Variable que acumula la suma de los números impares
        int sumaImpares = 0;

        System.out.println("Generando la secuencia de enteros al azar entre 0 y 10:");
        
        // Bucle que se repite mientras la suma de impares sea menor o igual a 25.
        while (sumaImpares <= 25) {
            //genera la secuencia de enteros al azar entre 0 y 100
            int numero = random.nextInt(11); 
            //verifica la paridad
            if (numero % 2 == 0) { 
                //indica si es par
                System.out.println(numero + " es par");
            } else {
                //indica si no es par
                System.out.println(numero + " no es par");
                sumaImpares = sumaImpares + numero;
            }
        }

        System.out.println("La suma de enteros impares (entre 0 y 10) ha alcanzado el valor de 25.");
        System.out.println("La suma final de impares es: " + sumaImpares + ".");
    }
}
