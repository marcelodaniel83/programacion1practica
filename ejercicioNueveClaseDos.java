/*
 Ingresar  la altura de una persona e imprimir si es Baja, Normal o Alta,
 de acuerdo con las siguientes condiciones:
a) Si la altura es menor a 1.60, es una persona baja.
b) Si la altura está comprendida entre 1.60 y 1.75 (ambos inclusive),
   es una persona Normal.
c) Si la altura supera a la medida de 1.75, es una persona Alta.

*/

import hsa.Console;
class ejercicioNueveClaseDos
{
    static Console c;
    public static void main (String arg[])

    {
	float altura;
	altura = 0.0f;

	c = new Console();

	c.print ("Ingrese la altura: ");
	altura = c.readFloat ();

	if (altura < 1.60)
	{
	    c.print ("Es una persona baja");
	}
	if (altura >= 1.60 && altura <= 1.75)
	{
	    c.print ("Es una persona normal");
	}
	if (altura >= 1.75)
	{
	    c.print ("Es una persona alta");
	}
    }
}

