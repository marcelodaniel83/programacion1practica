/*Ingresar el largo y el ancho de una habitación,
 y calcular su superficie. Si la superficie es mayor a 10,
 imprimir la leyenda "Habitación adecuada",
 de lo contrario, imprimir la leyenda "Habitación pequeña".
  (Superficie = largo * ancho
*/

import hsa.Console;
class ejercicioTresClaseDos

{
    static Console c;
    public static void main (String arg[])

    {
	int largo, ancho, superficie;
	c = new Console ();

	c.print ("Ingrese el largo: ");
	largo = c.readInt ();
	c.print ("Ingrese el ancho: ");
	ancho = c.readInt ();

	superficie = largo * ancho;

	if (superficie > 10)
	{
	    c.print ("Habitacion adecuada");
	}
	else
	{
	    c.print ("Habitacion chica");
	}
    }
}


