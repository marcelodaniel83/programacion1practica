/*
Realizar la carga de los vectores Productos
y Precios de 5 artículos. Posteriormente,
realizar un listado en dos columnas
indicando el valor acumulado de todos los
productos.

*/
import hsa.Console;
class Ejemplo42
{
    static Console c;
    String[] productos;
    float[] precios;
    Ejemplo42 ()
    {
        productos = new String [5];
        precios = new float [5];
    }


    void cargarDatos ()
    {
        c.println ("Cargue los datos de los articulos:");
            c.println ();
        for (int i = 0 ; i < productos.length ; i++)
        {
            c.print ("Ingrese producto[" + (i + 1) +
                    "]: ");
            productos [i] = c.readLine ();
            c.print ("Ingrese su precio: ");
            precios [i] = c.readFloat ();
            c.println ();
        }
    }


    void imprimirDatos ()
    {
        float suma = 0;
        int linea = 5;

        c.setCursor (3, 10);
        c.println ("Listado de Productos");
        c.setCursor (4, 10);
        c.println ("--------------------");
        for (int i = 0 ; i < productos.length ; i++)
        {
            c.setCursor (linea, 10);
            c.print (productos [i]);
            c.setCursor (linea, 30);
            c.print (precios [i], 8, 2);
            linea++;
            suma = suma + precios [i];
        }
        c.println ();
        c.println ();
        c.print (" La suma de los precios es:");
                c.print (suma, 8, 2);
    }


    public static void main (String arg[])
    {
        c = new Console ();
        Ejemplo42 e = new Ejemplo42 ();
        e.cargarDatos ();
        c.clear ();
        e.imprimirDatos ();
    }
}
