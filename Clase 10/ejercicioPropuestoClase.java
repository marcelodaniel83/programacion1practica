/*

Realiza un programa que resuelva éste enunciado.

- En un supermercado que tiene “n” articulos con los siguientes datos: Código,
Descripción y Precio, se deben realizar las siguientes operatorias:
1) Carga de los datos de cada articulo.
2) Listado completo ordenado por nombre en tres columnas.
3) Consulta por Código.
4) Consulta por Nombre.
5) Datos del artículo de menor costo.
Debes implementar un menú de opciones.

*/

import java.awt.*;
import hsa.Console;

public class Clase10
{
    static Console c;
    
    String[] articulo;
    int[] codigo;
    String[] descripcion;
    float[] precio;
    
    Clase10()
    {
        c.print("Ingrese la cantidad de productos a registrar: ");
        int n = c.readInt();
        
        articulo = new String[n];
        codigo = new int[n];
        descripcion = new String[n];
        precio = new float[n];
        
        c.clear();
    }
    
    void cargarDatos()
    {
        c.clear();
        c.print("--Cargar Datos--");
        c.println();
        
        for(int i = 0; i < articulo.length; i++)
        {
            c.print("Ingrese el nombre del articulo [" + (i+1) + "]: ");
            articulo[i] = c.readLine();
            
            c.print("Ingrese el codigo: ");
            codigo[i] = c.readInt();
            
            c.print("Ingrese una descripcion: ");
            descripcion[i] = c.readLine();
            
            c.print("Ingrese el precio: $");
            precio[i] = c.readFloat();
            
            c.println();
        }
        
        c.clear();
    }
    
    void imprimirDatos()
    {
        int fila;

        c.clear();
        c.print("--Datos ordenados por nombre--");
        c.println();
        c.setCursor(3,10);
        c.print("| Articulo        | Codigo        | Descripcion       | Precio       |");
        fila = 4;
        for(int i = 0; i < articulo.length; i++)
        {
            c.setCursor(fila, 12);
            c.println(articulo[i]);
            c.setCursor(fila, 30);
            c.println(codigo[i]);
            c.setCursor(fila, 46);
            c.println(descripcion[i]);
            c.setCursor(fila, 67);
            c.println(precio[i]);
            
            c.println();
            
            fila++;
        }
        
        c.print("Presione [ENTER] para volver al menu");
        c.readChar();
        
        c.clear();
    }
    
    void ordenarPorNombre()
    {
        c.clear();
        int n = articulo.length;
        String articuloAuxiliar;
        int codigoAuxiliar;
        String descripcionAuxiliar;
        float precioAuxiliar;
        
        for(int k = 1; k < n; k++)
        {
            for(int i = 0; i < n-k; i++)
            {
                if(articulo[i].compareTo(articulo[i+1]) > 0)
                {
                    articuloAuxiliar = articulo[i];
                    articulo[i] = articulo[i+1];
                    articulo[i+1] = articuloAuxiliar;
                    
                    codigoAuxiliar = codigo[i];
                    codigo[i] = codigo[i+1];
                    codigo[i+1] = codigoAuxiliar;
                    
                    descripcionAuxiliar = descripcion[i];
                    descripcion[i] = descripcion[i+1];
                    descripcion[i+1] = descripcionAuxiliar;
                    
                    precioAuxiliar = precio[i];
                    precio[i] = precio[i+1];
                    precio[i+1] = precioAuxiliar;
                }
            }
        }
        
    }
    
    void consultarPorCodigo()
    {
        int cx;
        char op;
        
        do
        {
            c.print("Ingrese el codigo del producto: ");
            cx = c.readInt();
            
            for(int i = 0; i < codigo.length; i++)
            {
                if(cx == codigo[i])
                {
                    c.println(articulo[i]);
                    c.println(descripcion[i]);
                    c.println(precio[i]);
                }
            }
            c.println();
            c.print("Quiere realizar otra consulta?(S/N): ");
            op = c.readChar();
            
            c.clear();
        }
        while(op == 's' || op == 'S');
        
        c.println("Presione [ENTER] para volver al menu");
        c.readChar();
        c.clear();
    }
    
    void consultarPorNombre()
    {
        String nx;
        char op;
        
        do
        {
            c.print("Ingrese el nombre del producto: ");
            nx = c.readLine();
            
            for(int i = 0; i < articulo.length; i++)
            {
                if(nx.equalsIgnoreCase(articulo[i]))
                {
                    c.println(codigo[i]);
                    c.println(descripcion[i]);
                    c.println(precio[i]);
                }
            }
            c.println();
            c.print("Quiere realizar otra consulta?(S/N): ");
            op = c.readChar();
            
            c.clear();
        }
        while(op == 's' || op == 'S');
        
        c.println("Presione [ENTER] para volver al menu");
        c.readChar();
        
        c.clear();
    }
    
    void menorCosto()
    {
        float px = precio[0];
        int posi = 0;
        
        for(int i = 0; i < precio.length; i++)
        {
            if(precio[i] < px)
            {
                px = precio[i];
                posi = i;
            }       
        }
        c.println(articulo[posi]);
        c.println(codigo[posi]);
        c.println(descripcion[posi]);
        c.println(precio[posi]);
        c.println();
        
        c.println("Presione [ENTER] para volver al menu");
        c.readChar();
        
        c.clear();
    }
    
    void mensaje()
    {
        c.println("Faltan cargar datos");
        c.println();
        c.println("Presione [ENTER] para volver al menu");
        c.readChar();
        c.clear();
    }
    
    public static void main (String[] args)
    {
        c = new Console ();
        Clase10 e = new Clase10();
        int op;
        int b = 0;
        
        do
        {
            c.println("1 - Cargar datos");
            c.println("2 - ver lista ordenada por nombre");
            c.println("3 - Consulta por codigo");
            c.println("4 - Consulta por nombre");
            c.println("5 - Ver articulo de menor costo");
            c.println("6 - Salir");
            c.println();
            c.print("Ingrese opcion: ");
            op = c.readInt();
            
            c.clear();
            
            switch(op)
            {
                case 1:
                    e.cargarDatos();
                    b = 1;
                    break;
                case 2:
                    if(b == 0)
                    {
                        e.mensaje();
                    }
                    else
                    {
                        e.ordenarPorNombre();
                        e.imprimirDatos();
                    }
                    break;
                case 3:
                    if(b == 0)
                    {
                        e.mensaje();
                    }
                    else
                    {
                        e.consultarPorCodigo();
                    }
                    break;
                case 4:
                    if(b == 0)
                    {
                        e.mensaje();
                    }    
                    else
                    {
                        e.consultarPorNombre();
                    }
                    break;
                case 5:
                    if(b == 0)
                    {
                        e.mensaje();
                    }
                    else
                    {
                        e.menorCosto();
                    }
                    break;
            }
        }
        while(op != 6);
        System.exit(0);
    }
}
