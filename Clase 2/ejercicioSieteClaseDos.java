/*
Realizar  un programa que permita ingresar el sueldo
 y los años de antigüedad de un operario y que informe el sueldo a cobrar,
teniendo en cuenta lo siguiente:
a) Si el sueldo es inferior a 4500 y su antigüedad es superior o igual a 10 años, otorgarle un aumento del 10%.
b) Si el sueldo es inferior  a  4500 y su antigüedad es menor a 10 años, otorgarle un aumento del 5%.
c) Si el sueldo es mayor o igual a 4500, no realizarle ningún aumento.

*/

import hsa.Console;
class ejercicioSieteClaseDos
{
    static Console c;
    public static void main (String arg[])

    {
	float sueldo, sueldoACobrar, aumento;
	int antiguedad;

	c = new Console ();

	c.print ("Ingrese monto del sueldo: ");
	sueldo = c.readFloat ();
	c.print ("Ingrese antiguedad: ");
	antiguedad = c.readInt ();

	if (sueldo < 4500 && antiguedad >= 10)
	{

	    aumento = sueldo * 10 / 100;
	    sueldoACobrar = sueldo + aumento;
	    c.print ("El sueldo total del operario es: " + sueldoACobrar);
	}

	if (sueldo < 4500 && antiguedad < 10)
	{
	    aumento = sueldo * 5 / 100;
	    sueldoACobrar = sueldo + aumento;
	    c.print ("El sueldo total del operario es: " + sueldoACobrar);
	}

	if (sueldo >= 4500)
	{
	    c.print ("No se realiza ningun aumento");
	}
    }
}




