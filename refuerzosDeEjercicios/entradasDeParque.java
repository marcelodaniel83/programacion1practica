/*
En 'Terra Mítica' se desea saber cuántas personas han pasado en un día.
Deben de decir su edad conforme entren, si su edad es inferior a 4, la entrada es gratis,
si la edad está comprendida entre 4 años y 12 años (incluídos), la entrada costará 20€, y si la edad supera a 12, la entrada costará 40€.
La taquilla se cerrará cuando la cajera introduzca una edad igual a -1.
Indicad, el número de niños con edades inferiores a 4 años, el número de niños con edad comprendida entre 4 y 12 años,
y el número de adultos.
Muestra también el número total de personas que han entrado y la caja que se ha hecho al final de la jornada.

Introduzca edad:
> 20
Introduzca edad:
>34
Introduzca edad:
>17
Introduzca edad:
>2
Introduzca edad:
-1

Bebes:1, Niños:0, Adultos:3
Número de entradas vendidas:4
Caja:120 €

*/

package parqueAtracciones;

import javax.swing.JOptionPane;

public class ParqueAtracciones {

   public static void main(String[] args) {

        int bebes=0,ninos=0,adultos=0,edad=0;
        String cadena;
        
        do {
            cadena=JOptionPane.showInputDialog("Introduzca edad");
            try {
                //Dependiendo de la de la edad que se introduzca, se incrementará
                //el contador correspondiente (bebes, ninos y adultos)
                edad=Integer.parseInt(cadena);
                if (edad!=-1){
                    if (edad>=0 && edad<4){
                        bebes++;
                    } else if (edad>=4 && edad<=12){
                        ninos++;
                    } else if (edad>12 && edad<150){
                        adultos++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduzca una edad correcta!!");
                    }
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Formato incorrecto!!");
            }
        } while(edad!=-1);
        System.out.println("Bebes:"+bebes+", Niños:"+ninos+", Adultos:"+adultos);
        System.out.println("Número de entradas vendidas:"+(bebes+ninos+adultos));
        System.out.println("Caja:"+(ninos*20+adultos*40)+" €");
    }
    
}

