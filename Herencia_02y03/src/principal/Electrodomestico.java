/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Locale;
import java.util.Scanner;


public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    /*comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible*/
    public void comprobarConsumoEnergetico(char letra) {

            letra = Character.toUpperCase(letra);
            if(letra >'F' || letra < 'A'){
                consumo = 'F';
            }else{
                consumo = letra;
            }
            
    }
    
    /*Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.*/
    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco")&&
                !color.equalsIgnoreCase("negro")&&
                !color.equalsIgnoreCase("rojo")&&
                !color.equalsIgnoreCase("azul")&&
                !color.equalsIgnoreCase("gris")){
            this.color = "blanco";
        }else{
            this.color = color;
        }
    }
    
    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.*/
    public void crearElectrodomestico(){
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("REGISTRO PRODUCTO");
        System.out.println("Precio:");
        Double precio = entry.nextDouble();
        if (precio<1000){
            this.precio = 1000;
        }else{
            this.precio = precio;
        }
        System.out.println("Color:");
        comprobarColor(entry.next());
        System.out.println("Consumo energetico:");
        comprobarConsumoEnergetico(entry.next().charAt(0));
        System.out.println("Peso:");
        this.peso = entry.nextDouble();
        precioFinal();
    }
    
    public void precioFinal(){
        switch(this.consumo){
            case 'A':
                this.precio += 1000;
            case 'B':
                this.precio += 800;
            case 'C':
                this.precio += 600;
            case 'D':
                this.precio += 500;
            case 'E':
                this.precio += 300;
            case 'F':
                this.precio += 100;
        }
        
        if (this.peso > 1 && this.peso < 20){
            this.peso += 100;
        } else if (this.peso > 19 && this.peso < 50){
            this.peso += 500;
        } else if (this.peso > 49 && this.peso < 80){
            this.peso += 800;
        } else if (this.peso > 80){
            this.peso += 100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
}
