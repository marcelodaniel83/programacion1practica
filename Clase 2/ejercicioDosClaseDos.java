/*Realizar un programa que lea por teclado dos números,
si el primero es mayor al segundo, informar su suma y diferencia,
 en caso contrario, informar el producto
 y la división del primero por el segundo.
 */


import hsa.Console;
class ejercicioDosClaseDos
{

    static Console c;
    public static void main (String arg[])
    {

	int numeroUno, numeroDos, suma, resta, producto, division;
	c= new Console ();



	c.print ("Ingrese el primer numero: ");
	numeroUno = c.readInt();
	c.print ("Ingrese el segundo numero: ");
	numeroDos = c.readInt();

	
	if (numeroUno > numeroDos)
	{

	    suma = numeroUno + numeroDos;
	    resta= numeroUno - numeroDos;
	    c.println("La suma es igual a " +suma+ ", y la diferencia es igual a " +resta);
	}
	else
	{
	    producto = numeroUno * numeroDos;
	    division = numeroUno / numeroDos;
	    c.println("El producto es igual a " +producto+ " y la division es igual a " +division);
	}
    }
}




