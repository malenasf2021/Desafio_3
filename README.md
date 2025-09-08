# Desafío 3

Implementa un programa en Java que genere una secuencia de enteros al azar entre 0 y 10.  
El programa debe:

- Mostrar cada entero en pantalla junto con un mensaje que indique si es par o no lo es.  
- Ir sumando todos los valores **impares** generados.  
- Detener el procesamiento en el momento en que la suma supere el valor **25**.  
- Al finalizar, mostrar en pantalla la suma calculada.

---

## Código en Java

```java
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
            // Genera un número entero al azar entre 0 y 10
            int numero = random.nextInt(11); 
            // Verifica la paridad
            if (numero % 2 == 0) { 
                // Indica si es par
                System.out.println(numero + " es par");
            } else {
                // Indica si no es par
                System.out.println(numero + " no es par");
                sumaImpares = sumaImpares + numero;
            }
        }

        System.out.println("La suma de enteros impares (entre 0 y 10) ha alcanzado el valor de 25.");
        System.out.println("La suma final de impares es: " + sumaImpares + ".");
    }
}
```
---

## Fundamentación
Primeramente, se importa la biblioteca estándar de Java java.util.Random, lo que permite utilizar la
clase Random para generar de manera repetitiva valores enteros en el rango de 0 a 10.
El programa se desarrolla íntegramente dentro del método main.
En primer lugar, se declara la variable random de tipo Random y se crea un nuevo objeto de esta clase
en memoria mediante la instrucción:

```java
Random random = new Random();
```
A continuación, se declara la variable sumaImpares, inicializada en cero, que se utilizará para acumular
los valores impares generados, deteniendo el proceso cuando la suma alcance 25.
Seguidamente, se muestra un mensaje inicial que funciona como título del programa:
```java
System.out.println("Generando la secuencia de enteros al azar entre 0 y 10:");
```
El flujo principal del programa se implementa con un bucle while cuya condición es que la suma acumulada en
sumaImpares sea menor o igual que 25. Dentro de cada iteración, se genera un número entero aleatorio
entre 0 y 10 mediante:
```java
int numero = random.nextInt(11);
```
Luego, se utiliza una estructura condicional if-else para determinar la paridad del número generado.
La verificación se realiza con el operador módulo (%), evaluando el resto de la división entre 2.
Si el resto es 0 (numero % 2 == 0), el número es par y se muestra el mensaje correspondiente;
de lo contrario, es impar, se informa en pantalla y su valor se suma al acumulador sumaImpares.
Esta operación de suma se puede escribir de forma equivalente como:
```java
sumaImpares = sumaImpares + numero;
```
o
```java
sumaImpares += numero;
```
El bucle continúa ejecutándose hasta que la suma de los números impares generados alcance el valor de 25 (<= 25).
Una vez cumplida esta condición, el programa muestra un mensaje final informando que el límite ha sido superado,
junto con el valor total acumulado.
