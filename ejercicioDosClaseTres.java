/*
Ingresar los sueldos de 4 empleados, y calcular el promedio de ellos.
Se deber� imprimir una leyenda que indique si el promedio est� por encima o por debajo del Nivel de Pobreza.
Este valor de Nivel de Pobreza, tambi�n deber� ser ingresado por teclado.
*/

import hsa.Console;
class ejercicioDosClaseTres
{
    static Console c;
    public static void main (String arg[])
    {

	float sueldoUno, sueldoDos, sueldoTres, sueldoCuatro, valorNivelPobreza, promedio;

	c = new Console ();

	c.print ("Ingrese primer sueldo: ");
	sueldoUno = c.readFloat ();
	c.print ("Ingrese segundo sueldo: ");
	sueldoDos = c.readFloat ();
	c.print ("Ingrese tercer sueldo: ");
	sueldoTres = c.readFloat ();
	c.print ("Ingrese cuarto sueldo: ");
	sueldoCuatro = c.readFloat ();

	c.print ("Ingrese valor de nivel de pobreza: ");
	valorNivelPobreza = c.readFloat ();

	promedio = (sueldoUno + sueldoDos + sueldoTres + sueldoCuatro) / 4;

	if (promedio < valorNivelPobreza)
	{
	    c.print ("El promedio por debajo del nivel de pobreza");
	}
	else
	{
	    c.print ("El promedio esta por encima del nivel de pobreza");
	}
    }
}
