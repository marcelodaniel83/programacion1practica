/*
desarrollar un programa que permita calcular cantidad de positivos,
la suma en java de éstos números y el promedio de todos los números positivos ingresados.

*/

public class Main {

    public static void main(String[] args) {
        int n,cp=0,x;
        float pp, sp=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println(“Ingresar cantidad de elementos:”);
        n=teclado.nextInt();
   
        for(int i=1;i<=n;i++)
        { 
         System.out.println(“Elemento [“+i+”]=”);
         x=teclado.nextInt();
         if(x>0)
         {sp=sp+x; 
         cp++;
         }
        }   
        pp=sp/cp;
         System.out.println(“Cantidad de positivos son:” +cp);
         System.out.println(“La suma de positivos son:” +sp);
         System.out.println(“El Promedio de positivos es:” +pp); 
         
    }   
}
