/*
Escribe una función que reciba como parámetro el número del que se quiere imprimir la tabla de multiplicar y la muestre por pantalla.
Desde la función prinpipal haz una llamada a dicha función con un número que le pidas al usuario.
Ejemplo:
Introduzca el número del que quiere ver la tabla de multiplicar:
> 5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50

*/

package funciontablamultiplicar;

import javax.swing.JOptionPane;

public class FuncionTablaMultiplicar {

    static void tablaMultiplicar(int numero){
        int i;
        
        for (i=1;i<=10;i++){
            System.out.println(numero+"*"+i+"="+(numero*i));
        }
    }
    public static void main(String[] args) {
        int num;
        
        try{
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número del que quiere ver la tabla de multipliar:"));
            tablaMultiplicar(num);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato Incorrecto");
        }
    } 
}
