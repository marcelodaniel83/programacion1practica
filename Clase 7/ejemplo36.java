/*
Almacenar en dos vectores las notas de los cursos A y B,
 sabiendo que el A tiene 20 alumnos y el B, 15.
  Realizar las siguientes operatorias:
 a | Cuántos alumnos de cada curso están promocionando (nota >= a 7).
 b | Cuántos alumnos de cada curso quedaron Libres (nota < a 4).
 c | Promedio general de cada curso.
 d | Indicar cuál es el curso de mayor promedio.

*/

import hsa.Console;
class Ejemplo36
{
    static Console c;
    public static void main (String arg[])
{
c = new Console ();
int[] a;
a = new int [20];
int[] b;
b = new int [15];
int promocionadoA, promocionadoB, libreA, libreB, suma;
promocionadoA = promocionadoB = libreA = libreB = suma = 0;
float pa, pb;
c.println ("Ingrese las " + a.length + " Notas para el curso A:");
for (int i = 0 ; i < a.length ; i++)
{
    c.print ("Nota [" + (i + 1) + "] = ");
    a [i] = c.readInt ();
    suma = suma + a [i];
    if (a [i] >= 7)
        promocionadoA++;
    if (a [i] < 4)
        libreA++;
}
pa = (float) suma / a.length;
suma = 0;
c.println ();
c.println ("Ingrese las " + b.length + " Notas para el curso B:");
for (int i = 0 ; i < b.length ; i++)
{
    c.print ("Nota [" + (i + 1) + "] = ");
    b [i] = c.readInt ();
    suma = suma + b [i];
    if (b [i] >= 7)
        promocionadoB++;
    if (b [i] < 4)
        libreB++;
}
pb = (float) suma / b.length;
c.println ();
c.println ();
c.println ("Cantidad de Promocionados en el curso               A: " + promocionadoA);
c.println ("Cantidad de Libres en el curso A: " + libreA);
c.println ("Promedio del curso A: " + pa);
c.println ();
c.println ("Cantidad de Promocionados en el curso              B: " + promocionadoB);
c.println ("Cantidad de Libres en el curso B: " + libreB);
c.println ("Promedio del curso B: " + pb);
c.println ();
if (pa > pb)
    c.print ("Curso de mayor promedio: A");
else
    c.print ("Curso de mayor promedio: B");
}
}


