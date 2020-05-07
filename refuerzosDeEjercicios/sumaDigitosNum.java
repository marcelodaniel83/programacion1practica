/*
Se trata de implementar un programa que sume los dígitos de un número entero no negativo. Por ejemplo, la suma de los dígitos del 3433 es 13.

Para darle un poco más de emoción, el programa no se limitará a escribir el resultado de la suma, sino que también escribirá todos los sumandos utilizados: 3 + 4 + 3 + 3 = 13.
*/

package reto1;
 
import java.util.Scanner;

public class Reto1
{
 
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int sum = 0;
        String salida = "";
        for (int i = 0; i < line.length(); i++)
        {
            int n = Integer.parseInt("" + line.charAt(i)) ;
            sum += n;
            if (i != line.length() - 1)
            {
                salida = salida.concat(n + " + ");
            } else
            {
                salida = salida.concat(n + " = " + sum);
            }
        }
 
        System.out.println(salida);
    }
 
}
