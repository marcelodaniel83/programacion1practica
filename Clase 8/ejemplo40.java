/*
En una empresa se almacenaron los sueldos
de 10 personas. Desarrollar un programa
para realizar:
1 | Carga de los sueldos en un vector.
2 | Impresión de todos los sueldos.
3 | ¿Cuántos tienen un sueldo superior a
$4000?
4 | Mostrar todos los sueldos que están por
debajo del promedio.

*/

import hsa.Console;
class Ejemplo40
{
    static Console c;
    float[] s;
    Ejemplo40 ()
    {
        s = new float [10];
    }


    void cargarSueldos ()
    {
        c.println ("Cargue los sueldos de las 10 personas:");
            for (int i = 0 ; i < s.length ; i++)
        {
            c.print ("Ingrese sueldo[" + (i + 1) + "]: ");
                    s [i] = c.readFloat ();
        }
    }


    void imprimirSueldos ()
    {
        c.println ("Sueldos almacenados: ");
        for (int i = 0 ; i < s.length ; i++)
        {
            c.println (" $ " + s [i]);
        }
    }


    void punto3 ()
    {
        int superior = 0;
        for (int i = 0 ; i < s.length ; i++)
        {
            if (s [i] > 4000)
                superior++;
        }
        c.println ();
        c.println ("Los sueldos superiores a $4000 son:" + superior);
    }


    float promedio ()
    {
        float suma = 0;
        float prom;
        for (int i = 0 ; i < s.length ; i++)
        {
            suma = suma + s [i];
        }
        prom = suma / s.length;
        return prom;
    }


    void punto4 ()
    {
        c.println ();
        c.println ("El promedio de sueldos es: $ "
                + promedio ());
        c.println ();
        c.println ("Los sueldos inferiores al promedio son:");
            for (int i = 0 ; i < s.length ; i++)
        {
            if (s [i] < promedio ())
                c.print (s [i] + " ");
        }
    }


    public static void main (String arg[])
    {
        c = new Console ();
        Ejemplo40 e = new Ejemplo40 ();
        e.cargarSueldos ();
        c.clear ();
        e.imprimirSueldos ();
        e.punto3 ();
        e.punto4 ();
    }
}
