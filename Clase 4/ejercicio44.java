/*
Imprimi los numeros pares en forma
decreciente desde el 800 hasta el 400
*/

import hsa.Console;
class Desempeno51
{
 static Console c;
 public static void main (String arg [])
 {
 int i;
 c = new Console ();
 i = 800;
 while (i >= 400)
 {
 c.print (i + " ");
 i = i - 1;
 }
 }
}


