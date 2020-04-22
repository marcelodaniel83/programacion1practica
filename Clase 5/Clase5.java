/*
insertar un valor entero. Realizar una cuenta regresiva hasa 0. Si el valor es mayor a 100 mostrar error.
*/

import hsa.Console;
class Dlase5
{
    static Console c;
    public static void main (String arg[])
    {

        int numero;

        c = new Console ();
        c.println ("Ingresar numero: ");
        numero = c.readInt ();

        if (numero <= 100 && numero >= 0)
        {

            while (numero <= 100 && numero >= 0)
            {

                c.print (numero-- + "-");

            }
        }
        else
        {
            print ("error");
        }

    }
}
