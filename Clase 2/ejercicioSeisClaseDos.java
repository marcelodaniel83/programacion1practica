/*
Ingresar  tres valores numéricos por teclado,
si todos son iguales, imprimir la leyenda: "Todos los números ingresados son iguales",
de lo contrario, imprimir la leyenda "No todos los números son iguales".
*/


import hsa.Console;
class ejercicioSeisClaseDos
{
    static Console c;
    public static void main (String arg[])
    {
	int valorUno, valorDos, valorTres;

	c = new Console ();

	c.print ("Ingrese el primer valor: ");
	valorUno = c.readInt ();
	c.print ("Ingrese el segundo valor: ");
	valorDos = c.readInt ();
	c.print ("Ingrese el tercer valor: ");
	valorTres= c.readInt ();
	
	

	if (valorUno == valorDos && valorDos == valorTres)
	{
	    
	    c.print ("Todos los numeross ingresados son iguales");
	}
	else
	{
	    c.print ("No todos los numeros son iguales");
	}
    }
}
