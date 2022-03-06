/*Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.*/

package principal;


public class Principal {

  
    public static void main(String[] args) {
        
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();
        
        System.out.println("---Lavadora---");
        lavadora.crearLavadora();
        System.out.println("---Televisor---");
        televisor.crearTelevisor();
        
        System.out.println("\nPrecio de la lavadora:");
        System.out.println(lavadora.getPrecio());
        System.out.println("Precio del televisor:");
        System.out.println(televisor.getPrecio());
    }

}
