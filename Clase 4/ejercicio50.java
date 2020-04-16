/*
Realiza un programa que permita cargar el peso de 10 personas y calcule su promedio,imprimiendo las siguientes leyendas:
1 Si el promedio es inferior a 55 kg, mostrar
"Peso insuficiente”
| Si el promedio esta entre 55 kg y 70 kg,
mostrar “Peso Ideal”
| Si el promedio esta entre 70 kg y 85 kg,
mostrar “Peso Normal”
| Si el promedio es superior a 85 kg, mostrar
“Peso Excedido”

*/

import hsa.Console;

class Desempeno50
{
    static void main(String[] args)
    {
        Console c = new Console();
        int average = 0;
        
        int i = 0;
        while (i < 10)
        {
            c.print("Ingresar el peso de la persona " + (i + 1) + ": ");
            average += c.readInt() / 10;
            i++;
        }
        
        c.println("El peso promedio es: "+average);
        if (average < 55)
            c.println("Peso insuficiente.");
        else if (average <= 70)
            c.println("Peso ideal.");
        else if (average <= 85)
            c.println("Peso normal.");
        else
            c.println("Peso excedido.");
    }
}
