
package principal;

import java.util.Locale;
import java.util.Scanner;


public class Televisor extends Electrodomestico{
 
    protected int resolucion;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.*/
    public void crearTelevisor(){
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        super.crearElectrodomestico();
        System.out.println("Resolucion:");
        this.resolucion = entry.nextInt();
        System.out.println("Posee sintonizador TDT? S/N");
        String rtta;
        boolean incorrecta = true;
        while (incorrecta){
            rtta = entry.next();
        if (rtta.equalsIgnoreCase("S")){
            this.tdt = true;
            incorrecta = false;
        } else if (rtta.equalsIgnoreCase("N")) {
            this.tdt = false;
            incorrecta = false;
        } else {
            System.out.println("Ingrese una opcion valida");
        }
        }
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (this.resolucion > 40)
            this.precio += (this.precio * 0.3);
        if (this.tdt)
            this.precio += 500;
    }
    
    
}
