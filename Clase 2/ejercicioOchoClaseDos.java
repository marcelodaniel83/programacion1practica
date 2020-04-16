/*
 Se debe ingresar tres números por teclado,
si al menos uno de los números es menor a 10,
imprimir la leyenda "Alguno de los números es menor a 10" de lo contrario,
"Ninguno de los números es menor a 10".

*/

import hsa.Console;
class ejercicioOchoClaseDos
{
    static Console c;
    public static void main (String arg[])

    {
	int primerValor, segundoValor, tercerValor;

	c = new Console ();

	c.print ("Ingrese el primer valor: ");
	primerValor = c.readInt ();
	c.print ("Ingrese el segundo valor: ");
	segundoValor = c.readInt ();
	c.print ("Ingrese el tercer valor: ");
	tercerValor = c.readInt ();

	if (primerValor < 10 || segundoValor < 10 || tercerValor < 10)
	{
	    c.print ("Alguno de los numeros es menor a 10");
	}
	else
	{
	    c.print ("Ninguno de los numeros es menor a 10");
	}
    }
}

