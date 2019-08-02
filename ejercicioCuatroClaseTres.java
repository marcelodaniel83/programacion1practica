/*
 Leer  un valor entero. Mostrar el número de día que corresponde a ese valor.
Suponer que 0 corresponde a domingo,
se debe mostrar el nombre del día que le corrresponde.

*/

import hsa.Console;
class ejercicioCuatroClaseTres
{
    static Console c;
    public static void main (String arg[])
    {
	int numeroDeDia;
	c = new Console ();

	c.print ("Ingrese numero de dia: ");
	numeroDeDia= c.readInt();
	     


	switch (numeroDeDia)
	{

	    case 0:
		numeroDeDia = 0;
		c.print ("Corresponde al dia domingo");
		break;

	    case 1:
		numeroDeDia = 1;
		c.print ("Corresponde al dia lunes");
		break;

	    case 2:
		numeroDeDia = 3;
		c.print ("Corresponde al dia martes");
		break;

	    case 3:
		numeroDeDia = 4;
		c.print ("Corresponde al dia miercoles");
		break;

	    case 4:
		numeroDeDia = 5;
		c.print ("Correponde al dia jueves");
		break;

	    case 5:
		numeroDeDia = 6;
		c.print ("Corresponde al dia viernes");
		break;

	    case 6:
		numeroDeDia = 7;
		c.print ("Corresponde al dia sabado");
		break;
	}
    }

}
