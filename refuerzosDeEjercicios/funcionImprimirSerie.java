/*
Escribe una función “ImprimeSerie” a la que le pases dos enteros y te escriba por la pantalla todos los valores comprendidos entre ambos.
Lo hará en orden ascendente si el primero es menor que el segundo y descendente en caso contrario.
Desde la función principal "main" tendrás que hacer una llamada a dicha función con dos números que tendrás que pedir al usuario.
Introduzca el primer valor:
> 5
Introduzca el segundo valor:
> 15

Serie Ascendente:
6, 7, 8, 9, 10, 11, 12, 13, 14

Introduzca el primer valor:
> 85
Introduzca el segundo valor:
> 55

Serie Descendente:
84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56

*/

package imprimeserie;

import javax.swing.JOptionPane;

public class ImprimeSerie {

    static void imprimeSerie(int a,int b){
        int i;
        
        if (a>b){
            System.out.print("Serie descendente: ");
            for (i=a-1;i>=b+1;i--){
                System.out.print(i+" ");
            }
        } else {
            System.out.print("Serie ascendente: ");
            for (i=a+1;i<=b-1;i++){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        int primero,segundo;
        try{
            primero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer valor: "));
            segundo=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo valor: "));
            imprimeSerie(primero,segundo);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato Incorrecto");
        }
    }
}
