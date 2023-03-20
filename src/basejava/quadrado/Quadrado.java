package basejava.quadrado;

public class Quadrado {
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

}
