/*

Imprimí todos los múltiplos de 7 menores a
100.(0 - 7 - 14 - 21 - 28…)

*/


import hsa.Console;
    class clase4_44
{
    static Console c;
    public static void main (String arg [])
{   c = new Console (); 
    int i=0;
 

    while (i <= 100)
{
    c.print (i + " ,");
    i = i + 7;
