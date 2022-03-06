/*

 */
package principal;

public class Animal {
    protected String nombre;
    protected String alimento;
    protected String raza;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    
    
    public void alimentacion(){
        System.out.println(nombre + " se alimenta de " + alimento);}
}
