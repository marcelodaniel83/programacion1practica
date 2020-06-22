/*
Tenemos dos vectores, en uno se deben cargar los nombres de las provincias Argentinas y en el otro las temperaturas medias anuales de cada una de ellas.
 Debemos llevar a cabo las siguientes operatorias:
 Realizar un listado por pantalla de las

a)provincias en orden alfabetico.

b) Realizar un listado ordenado por las temperaturas (desde la temperatura más baja hasta la más alta)
c | Realizar un Menú de opciones, con las siguientes alternativas:
 [Carga de Datos] -
 [Listado Ordenado por Provincia] -
 [Listado Ordenado por Temperaturas] -
 [Finalizar]

*/

import hsa.Console;
import java.awt.*;
class Ejemplo47
{
    static Console c;
    String[] provincias;
    float[] temperaturas;
    Ejemplo47 ()
    {
        c.print ("Ingrese la cantidad de provincias: ");
        int n = c.readInt ();
        provincias = new String [n];
        temperaturas = new float [n];
    }


    void cargarDatos ()
    {
        c.clear ();
        c.println ("Cargue los datos");
        c.println ();
        for (int i = 0 ; i < provincias.length ; i++)
        {
            c.print ("Ingrese provincias[" + (i + 1) + "]: ");
            provincias [i] = c.readLine ();
            c.print ("Ingrese su Temperatura: ");
            temperaturas [i] = c.readFloat ();
            c.println ();
        }
    }


    void imprimir ()
    {
        int fila;
        c.setCursor (3, 10);
        c.print ("Provincias");
        c.setCursor (4, 10);
        c.print ("----------");
        c.setCursor (3, 30);
        c.print ("Temperaturas");
        c.setCursor (4, 30);
        c.print ("------------");
        fila = 5;
        for (int i = 0 ; i < provincias.length ; i++)
        {
            c.setCursor (fila, 10);
            c.print (provincias [i]);
            c.setCursor (fila, 30);
            c.print (temperaturas [i], 4, 1);
            fila++;
        }
        c.println ();
        c.println ();
        c.setTextColor (Color.red);
        c.print (" Digite [Enter] para retornar al Menu ");
        c.readChar ();
    }


    void ordenarPorProvincias ()
    {
        int n = provincias.length;
        String auxiProvincia;
        float auxiTemperatura;
        for (int k = 1 ; k < n ; k++)
        {
            for (int i = 0 ; i < n - k ; i++)
            {
                if (provincias [i].compareTo (provincias [i + 1]) > 0)
                {
                    auxiProvincia = provincias [i];
                    provincias [i] = provincias [i + 1];
                    provincias [i + 1] = auxiProvincia;
                    auxiTemperatura = temperaturas [i];
                    temperaturas [i] = temperaturas [i + 1];
                    temperaturas [i + 1] = auxiTemperatura;
                }
            }
        }
    }


    void ordenarPorTemperaturas ()
    {
        int n = provincias.length;
        String auxiProvincia;
        float auxiTemperatura;
        for (int k = 1 ; k < n ; k++)
        {
            for (int i = 0 ; i < n - k ; i++)
            {
                if (temperaturas [i] > temperaturas [i + 1])
                {
                    auxiProvincia = provincias [i];
                    provincias [i] = provincias [i + 1];
                    provincias [i + 1] = auxiProvincia;
                    auxiTemperatura = temperaturas [i];
                    temperaturas [i] = temperaturas [i + 1];
                    temperaturas [i + 1] = auxiTemperatura;
                }
            }
        }
    }


    public static void main (String arg[])
    {
        c = new Console ();
        Ejemplo47 e = new Ejemplo47 ();
        int op;
        c.setTextBackgroundColor (Color.cyan);
        do
        {
            c.clear ();
            c.setTextColor (Color.blue);
            c.setCursor (3, 10);
            c.print ("Menu de Opciones");
            c.setCursor (4, 10);
            c.print ("----------------");
            c.setCursor (5, 10);
            c.print ("1- Cargar Datos");
            c.setCursor (6, 10);
            c.print ("2- Listado ordenado por Provincias");
            c.setCursor (7, 10);
            c.print ("3-Listado ordenado por Temperaturas");
            c.setCursor (8, 10);
            c.print ("4- Finalizar el programa");
            c.setCursor (12, 10);
            c.print ("Digite la opcion: ");
            op = c.readInt ();
            switch (op)

                {
                    case 1:
                        e.cargarDatos ();
                        break;
                    case 2:
                        c.clear ();
                        c.setCursor (1, 10);
                        c.print ("Listado Ordenado por Provincias");
                        e.ordenarPorProvincias ();
                        e.imprimir ();
                        break;
                    case 3:
                        c.clear ();
                        c.setCursor (1, 10);
                        c.print ("Listado Ordenado por Temperaturas");
                        e.ordenarPorTemperaturas ();
                        e.imprimir ();
                        break;
                }
        }
        while (op != 4);
        System.exit (0);
    }
}
