

package principal;


public class Principal {

  
    public static void main(String[] args) {
        
        Perro perro = new Perro("Tobi", "balanceado", "chiuhaua", 4);
        perro.alimentacion();
        
        Gato gato = new Gato("Snow", "balanceado", "angora", 5);
        gato.alimentacion();
        
        Caballo caballo = new Caballo("Raul", "pasto", "criollo", 7);
        caballo.alimentacion();
    }

}
