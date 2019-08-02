// Ingresar 4 números y mostrar el mayor de ellos.

import hsa.Console;
class ejercicioSeisClaseTres
{
    static Console c;
    public static void main (String arg[])
    {
int primerNumero, segundoNumero, tercerNumero, cuartoNumero;

c= new Console();

c.print("Ingresar primer numero: ");
primerNumero= c.readInt();
c.print("Ingresar segundo numero: ");
segundoNumero= c.readInt();
c.print("Ingresar tercer numero: ");
tercerNumero= c.readInt();
c.print("Ingresar cuarto numero: ");
cuartoNumero= c.readInt();

switch(primerNumero){

case 1:

if (primerNumero>segundoNumero){
c.print("el mayor numero es: "+primerNumero);
}else{
c.print("el mayor numero es: "+segundoNumero);
brake;
}


case 2:

if(primerNumero>tercerNumero){
c.print("el mayor numero es: "+primerNumero);
}else{
c.print("el mayor numero es: "+tercerNumero);
}
brake;

case 3:

if(primerNumero>cuartoNumero){
c.print("el mayor numero es: "+primerNumero);
}else{
c.print("el mayor numero es: "+tercerNumero);
}
brake;

case 4:
if(segundoNumero>tercerNumero){
c.print("el mayor numero es: "+segundoNumero);
}else{
c.print("el mayor numero es: "+tercerNumero);
}
brake;

case5:

if(segundoNumero>cuartoNumero){
c.print("el mayor numero es: "+segundoNumero);
}else{
c.print("el mayor numero es: "+cuartoNumero);
}
brake;

case 6:

if(tercerNumero>cuartoNumero){
c.print("el mayor numero es: "+tercerNumero);
}else{
c.print("el mayor numero es: "+cuartoNumero);
}
brake;
}}}}


