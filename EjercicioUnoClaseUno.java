/* Ejercicio 1 Clase 1 P1 Calcular el sueldo mensual de un operario conociendo
la cantidad de horas trabajadas y el valor por hora

*/


import hsa.Console;
class EjercicioUnoClaseUno

{

/* esta instruccion se utiliza para los metodos de entrada y salida readInt,
readFloat, println) con el objeto c 

*/

static Console c;
public static void main(String arg[])

  {
  
  c = new Console();
  float sueldoMensual, valorHora;
  int cantidadHoras;
 
  
  c.println("Ingrese cantidad de horas trabajadas: ");
  cantidadHoras= c.readInt();
  
  c.println("Ingrese valor por hora trabajada: ");
  valorHora = c.readFloat();
  
  sueldoMensual = cantidadHoras*valorHora;
  
 
  c.println ("El sueldo mensual del operario es: " +sueldoMensual);
 
  
  }
}
  
  
  
    

