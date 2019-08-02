/* Ingresar una fecha por teclado, día mes y año,
 y determinar si corresponde al primer trimestre del año. 
 Mostrarlo las leyendas: "Corresponde al primer Trimestre"
o "No corresponde al primer Trimestre", según corresponda.
*/

import hsa.Console;
class ejercicioCuatroClaseDos

{
    static Console c;
    public static void main (String arg[])

    {
int fecha, dia, mes, anio;
c= new Console(); 

c.print ("Ingrese fecha: ");
fecha= c.readInt();
c.print("Ingrese mes: ");
mes= c.readInt();
c.print("Ingrese anio: ");
anio=c.readInt();


if ( mes>=1 && mes<=3){

c.print("Corresponde al primer trimestre");


}else{

c.print("No corresponde al primer trimestre");

}
}
}


