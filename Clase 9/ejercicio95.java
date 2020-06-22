/*
Una empresa que realiza cursos de computación tiene la siguiente
información:
a | Cargar en vectores los nombres de los cursos y las cantidades de
inscriptos en cada curso en los meses de enero, febrero, y marzo.
b | Obtener el total de alumnos que se han inscripto en los tres meses
para cada curso.
c | Mostrar el nombre del curso que ha tenido mayor cantidad de
inscripciones.
d | En los meses de enero y febrero ¿Cuál fue la cantidad de inscripciones
en total en la academia (sin discriminar por cursos)?
e | En el mes de marzo reducir en 5 la cantidad de inscriptos a todos los
cursos e imprimir los inscriptos de marzo.

*/

import hsa.Console;
class PropuestoNueve3
{
    static Console c;
    String[] nombre;
    int[] enero;
    int[] febrero;
    int[] marzo;
    int[] total;

    PropuestoNueve3 ()
    {
        nombre = new String [4];
        enero = new int [4];
        febrero = new int [4];
        marzo = new int [4];
        total = new int [4];
    }


    void cargarDatos ()  //Punto a
    {
        int fila = 4;
        c.setCursor (2, 5);
        c.print ("Nombre");
        c.setCursor (2, 20);
        c.print ("Enero");
        c.setCursor (2, 35);
        c.print ("Febrero");
        c.setCursor (2, 50);
        c.print ("Marzo");
        for (int i = 0 ; i < nombre.length ; i++)
        {
            c.setCursor (fila, 5);
            nombre [i] = c.
                readLine ();
            c.setCursor (fila, 20);
            enero [i] = c.readInt ();
            c.setCursor (fila, 35);
            febrero [i] = c.readInt ();
            c.setCursor (fila, 50);
            marzo [i] = c.readInt ();
            fila++;
        }
    }


    void totalDeAlumnos ()  //Punto b
    {
        int fila = 4;
        c.setCursor (2, 65);
        c.print ("Total");
        for (int i = 0 ; i < enero.length ; i++)
        {
            total [i] = enero [i] + febrero [i] + marzo [i];
            c.setCursor (fila, 65);
            c.print (total [i], 4);
            fila++;
        }
        c.readChar ();
    }


    void mayor ()  //Punto c
    {
        int m = total [0];
        int posicion = 0;
        for (int i = 1 ; i < total.length ; i++)
            if (total [i] > m)
            {
                m = total [i];
                posicion = i;
            }
        c.println ();
        c.println ();
        c.print ("el curso con mayor cantidad de inscriptos es:");
        c.println (nombre [posicion]);
        c.readChar ();
    }


    void totalEneroFebrero ()  //Punto d
    {
        int suma = 0;
        for (int i = 0 ; i < enero.length ; i++)
        {
            suma = suma + enero [i] + febrero [i];
        }
        c.println ();
        c.print ("El total en los meses de Enero y Febrero es:");
        c.println (suma);
        c.readChar ();
    }


    void reducir ()  //Punto e
    {
        int fila = 4;
        c.println ();
        c.print ("Pulse [Enter] para reducir en 5 los inscriptos en marzo ");
                c.readChar ();
        for (int i = 0 ; i < marzo.length ; i++)
        {
            marzo [i] = marzo [i] - 5;
            c.setCursor (fila, 50);
            c.print (marzo [i], 4);
            fila++;
        }
    }


    public static void main (String arg[])
    {
        c = new Console ();
        PropuestoNueve3 p = new
            PropuestoNueve3 ();
        p.cargarDatos ();
        p.totalDeAlumnos ();
        p.mayor ();
        p.totalEneroFebrero ();
        p.reducir ();
        p.totalDeAlumnos ();
        System.exit (0);
    }
}
