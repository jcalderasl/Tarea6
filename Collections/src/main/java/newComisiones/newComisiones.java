
package newComisiones;

import java.util.*;
import modelos.MdVendedor;


public class newComisiones {
    Scanner t = new Scanner(System.in);//lee los datos que ingresamos
    public List<MdVendedor> Todos = new ArrayList<MdVendedor>();//declaramos una lista de tipo Md que se llama todos
    
    private MdVendedor Ingreso_informacion(){//creamos un metodo que devuelve Md vendedor
        MdVendedor vende = new MdVendedor();
        
        
        System.out.println("Ingrese Nombre");
        vende.nombre = t.nextLine();
        System.out.println("Ingrese Enero");
        vende.enero = t.nextDouble();        
        System.out.println("Ingrese Febrero");
        vende.febrero = t.nextDouble();       
        System.out.println("Ingrese Marzo");
        vende.marzo = t.nextDouble();
        
        Todos.add(vende);// lo coloca dentro de la variable todos como una lista
        return vende;
        
    }
    
    private void desplegarDato(){//creamos otro metodo
        for(MdVendedor ele: Todos){//cada elemento lo guarda en ele
            System.out.println("Nombre = "+ele.nombre);
            System.out.println("Enero = "+ele.enero);
            System.out.println("Febrero = "+ele.febrero);
            System.out.println("Marzo = "+ele.marzo);
        }
    }
      public  void imprimirDecorado(){
       
       
        
    }
     
    
    public void menu(){
        String opc = "";
        do{
            System.out.println("1- Ingreso de Informacion");
            System.out.println("2- Ver Informacion");
            System.out.println("3- Cerrar ");
            opc = t.nextLine();//llamamos a la opcion
            switch(opc){
                case "1": Ingreso_informacion();
                break;
                case "2": desplegarDato();
                break;            
            }
          
            
        }while(!opc.equals("3"));//el equals se usa para comparar dos objetos
    }
}
