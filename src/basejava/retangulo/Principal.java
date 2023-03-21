package basejava.retangulo;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo();
        retangulo.mudarBase(10);
        retangulo.mudarAltura(5);

        JOptionPane.showMessageDialog(null, ""
        + "Valor da base: " + retangulo.mostrarBase() + "\n" 
        + "Valor da altura: " + retangulo.mostrarAltura() + "\n"
        + "Valor da Área: " + retangulo.calcularArea() + "\n"
        + "Valor do Perímetro: " + retangulo.calcularPeri() + "\n");
    }
}
