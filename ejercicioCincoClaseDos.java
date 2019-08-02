/*
Ingresar el precio de un artículo y un código que informe lo siguiente: Si el código es 1, es porque se abona de contado.
 Si el código es 2, es porque se abona con tarjeta. Imprimir el importe  abonar teniendo en cuenta que: Si se abona de contado,
 se debe realizar un descuento del 5% del precio de venta.
 Si se abona con tarjeta, se debe realizar un incremento del 10 % del precio de venta.

*/

import hsa.Console;
class ejercicioCincoClaseDos
{
    static Console c;
    public static void main (String arg[])

    {
	float precioDeArticulo, porcentaje, precioTotal;
	int codigo;

	c = new Console ();

	c.print ("Ingrese precio del articulo: ");
	precioDeArticulo = c.readFloat ();
	c.print ("Ingrese codigo: ");
	codigo = c.readInt();
	

	if (codigo==1)
	{

	    porcentaje = precioDeArticulo * 5 / 100;
	    precioTotal = precioDeArticulo - porcentaje;
	    c.print ("Se abona al contado. El importe total a abonar es de: " + precioTotal);

	}
	if (codigo==2)
	{
	    porcentaje = precioDeArticulo * 10 / 100;
	    precioTotal = precioDeArticulo + porcentaje;
	    c.print ("Se abona con tarjeta. El importe total a abonar es de: " + precioTotal);
	}
	
    }
}
