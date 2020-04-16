//Ingresar un número de hasta 5 cifras, y determinar cuantos digitos tiene.

import hsa.Console;
class ejercicioUnoClaseTres
{
    static Console c;
    public static void main (String arg[])


    {
	int numero, digitos;

	c = new Console ();

	c.print ("Ingrese numero hasta cinco cifras: ");
	numero = c.readInt ();

	if (numero >= 0 && numero <= 9)
	{
	    c.println ("El numero tiene un digito.");
	}
	else
	    if (numero >= 10 && numero <= 99)
	    {
		c.println ("El numero tiene dos digitos.");
	    }
	    else
		if (numero >= 100 && numero <= 999)
		{
		    c.println ("El numero tiene tres digitos.");
		}
		else
		    if (numero >= 1000 && numero <= 9999)
		    {
			c.println ("El numero tiene cuatro digitos.");
		    }
		    else
			if (numero >= 10000 && numero <= 99999)
			{
			    c.println ("El numero tiene cinco digitos.");
			}
    }
}
