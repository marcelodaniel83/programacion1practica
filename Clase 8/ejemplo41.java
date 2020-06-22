/*
Un comercio tiene dos turnos (mañana y
tarde) en los que trabajan 8 empleados
(4 por la mañana y 4 por la tarde).
Confeccionar un programa que permita
almacenar los sueldos de los empleados
agrupados por turno. Imprimir los gastos en
sueldos de cada turno.

*/

import hsa.Console;
class Ejemplo41
{
    static Console c;
    float[] sM;
    float[] sT;
    Ejemplo41 ()
    {
        sM = new float [4];
        sT = new float [4];
    }


    void cargarSueldosM ()
    {
        c.println ("Cargue los sueldos del Turno Manana:");
            for (int i = 0 ; i < sM.length ; i++)
        {
            c.print ("Ingrese sueldo[" + (i + 1) +
                    "]: ");
            sM [i] = c.readFloat ();
        }
    }


    void cargarSueldosT ()
    {
        c.println ("Cargue los sueldos del Turno Tarde:");
            for (int i = 0 ; i < sT.length ; i++)
        {
            c.print ("Ingrese sueldo[" + (i + 1) +
                    "]: ");
            sT [i] = c.readFloat ();
        }
    }


    float gastos (float[] s)
    {
        float suma = 0;
        for (int i = 0 ; i < s.length ; i++)
        {
            suma = suma + s [i];
        }
        return suma;
    }


    void imprimirGastos ()
    {
        c.println ();
        c.println ("Gasto del turno Manana: $ " +
                gastos (sM));
        c.println ("Gasto del turno Tarde : $ " +
                gastos (sT));
    }


    public static void main (String arg[])
    {
        c = new Console ();
        Ejemplo41 e = new Ejemplo41 ();
        e.cargarSueldosM ();
        c.println ();
        e.cargarSueldosT ();
        c.println ();
        e.imprimirGastos ();
    }
}
