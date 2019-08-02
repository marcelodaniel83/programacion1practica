/*

Escribir un programa en el cual:
dada una lista de tres valores numéricos distintos se calcule
e informe su rango de variación (debe mostrar el menor y el mayor de ellos).
Ejemplo: Si se introducen los números:  8 , 2  y  5
La impresión debería ser:  Rango = [2..8]

*/


import hsa.Console;
class ejercicioTresClaseTres
{
    static Console c;
    public static void main (String arg[])
    {
	int valorUno, valorDos, valorTres, valorCuatro;

	c = new Console ();

	c.print ("Ingrese primer valor: ");
	valorUno = c.readInt ();
	c.print ("Ingrese segundo valor: ");
	valorDos = c.readInt ();
	c.print ("Ingrese tercer valor: ");
	valorTres = c.readInt ();
	c.print("Ingrese cuarto valor: ");
	valorCuatro= c.readInt();

	if (valorUno < valorDos && valorTres < valorCuatro)
	{
	    c.print ("Rango = " +valorUno + valorDos + valorTres + valorCuatro);
	}
	else
	    if (valorDos < valorUno && valorTres < valorCuatro)
	    {
		c.print ("Rango= " +valorDos + valorUno + valorTres + valorCuatro);
	    }
	    else
		if (valorTres < valorUno && valorDos < valorCuatro)
		{
		    c.print ("Rango= " +valorTres + valorUno + valorDos + valorCuatro);
		}
		else
		    if (valorCuatro < valorUno && valorDos < valorTres)
			;
	{
	    c.print ("Rango= " +valorCuatro + valorUno + valorDos + valorTres);
	}
    }
}




