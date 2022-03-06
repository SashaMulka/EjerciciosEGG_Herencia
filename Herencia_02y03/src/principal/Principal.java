/*Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.*/

package principal;

import java.util.ArrayList;
import java.util.List;


public class Principal {

  
    public static void main(String[] args) {
        
        List<Electrodomestico> electrodomesticos = new ArrayList();
        double costoLavadoras = 0;
        double costoTelevisores = 0;
        double costoTotal = 0;
        
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora();
        Televisor televisor1 = new Televisor();
        Televisor televisor2 = new Televisor();
        
        System.out.println("---Lavadora 1---");
        lavadora1.crearLavadora();
        System.out.println("---Lavadora 2---");
        lavadora2.crearLavadora();
        System.out.println("---Televisor 1---");
        televisor1.crearTelevisor();
        System.out.println("---Televisor 2---");
        televisor2.crearTelevisor();
        
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Lavadora)
               costoLavadoras += electrodomestico.getPrecio(); 
            else if(electrodomestico instanceof Televisor)
               costoTelevisores += electrodomestico.getPrecio(); 
            costoTotal += electrodomestico.getPrecio();
        }
        
        System.out.println("Valor de las lavadoras:" + costoLavadoras);
        System.out.println("Valor de los televisores: " + costoTelevisores);
        System.out.println("Valor total: " + costoTotal);
        
//        System.out.println("\nPrecio de la lavadora:");
//        System.out.println(lavadora.getPrecio());
//        System.out.println("Precio del televisor:");
//        System.out.println(televisor.getPrecio());


        
       
    }

}
