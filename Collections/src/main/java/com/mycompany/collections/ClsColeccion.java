
package com.mycompany.collections;


import java.util.*;
import modelos.MdVendedor;
import newComisiones.newComisiones;

/**
 *
 * @author PC
 */
public class ClsColeccion {
    public static void main(String[] args) {
        
        
        newComisiones comi =  new newComisiones();
        comi.menu();
        
        /*
     MdVendedor vende = new MdVendedor();
     vende.nombre="Juan";
     vende.enero= 30;
     vende.febrero= 40;
     vende.marzo= 10;
     
     MdVendedor vende2 = new MdVendedor();
     vende2.nombre="María";
     vende2.enero= 10;
     vende2.febrero= 60;
     vende2.marzo= 80;
     List<MdVendedor> local = new ArrayList<MdVendedor>();
     
     MdVendedor ventemp = new MdVendedor();
     ventemp.nombre = "Jesus";
     ventemp.enero=10;
     ventemp.febrero=15;
     local.add(ventemp);
     desplegarLocal(local);
     ventemp = new MdVendedor();
        System.out.println("Nueva Informacion = ");
     ventemp.nombre = "Maria";
     ventemp.enero=90;
     ventemp.febrero=195;
     local.add(ventemp);
     desplegarLocal(local);
     ventemp = new MdVendedor();
      System.out.println("Nueva Informacion = ");
     ventemp.nombre = "Carlos";
     ventemp.enero=44;
     ventemp.febrero=15;
     local.add(ventemp);
     desplegarLocal(local);
     
    }
    
    public static void desplegarLocal(List<MdVendedor>arre){
        for(MdVendedor ele: arre){
            System.out.println("Nombre = "+ele.nombre);
            System.out.println("Enero = "+ele.enero);
            System.out.println("Febrero = "+ele.febrero);
            System.out.println("Marzo = "+ele.marzo);
        }
 */   
}

    public static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("Elemento = "+ elemento);
        }
    } 
}
