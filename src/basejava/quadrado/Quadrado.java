package basejava.quadrado;

import java.io.ObjectStreamClass;
public class Quadrado {
    
/*
Modo está correto, mas a utilização do public faria eu perder ponto em uma avaliação.

    public double tamlad;

    public void mudarValor(double tamlad) {
        this.tamlad = tamlad;
    }
    public double mostrarValor() {
        return tamlad;
    }
    public double calcularArea() {
        return tamlad * tamlad;
    }
*/

    private float lado;

    public float getLado(){
        return this.lado;
    }
    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }
    public float calcularArea() {
        return lado * lado;
    }
    
}
