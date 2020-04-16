/*Ingresar un número por teclado en el rango de
 0 a 99 y determinar si tiene uno dos dígitos
 */
 
import hsa.Console;
 class ejercicioUnoClaseDos
  {     
  static Console c;    
   public static void main (String arg []) 
    {
    int numero=0;
    c= new Console();
    
    c.println();
    c.println("Ingrese numero: ");
    numero=c.readInt();
    
    c.println();
    
    if (numero>=0 && numero<=9 ){
    c.println("El numero ingresado tiene un digito");
    }
    if (numero>=10 && numero<=99){
    c.println("El numero ingresado tiene dos digitos");
    }
}
}
