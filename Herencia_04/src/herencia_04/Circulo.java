
package herencia_04;


public class Circulo implements calculosFormas{
    
 private double radio;
 private double diametro;

    public Circulo() {
    }

    public Circulo(double diametro) {
        this.radio = diametro / 2;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * diametro;
    }
 
 
 
 
}
