package basejava.retangulo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import basejava.quadrado.Quadrado;

public class Principal {
    public static void main(String[] args){
        List<Retangulo> retangulos = new ArrayList<>();
        String dadosEntrada = " ";
        while (!dadosEntrada.equals("")){
            try {
                
                dadosEntrada = JOptionPane.showInputDialog(null, "Qual o tamanho da base do retangulo?");
                if (!dadosEntrada.equals("")){
                    Retangulo retangulo = new Retangulo();
                    retangulo.setBase(Float.parseFloat(dadosEntrada));
                dadosEntrada = JOptionPane.showInputDialog(null, "Qual o tamanho da altura do retangulo?");
                    retangulo.setAltura(Float.parseFloat(dadosEntrada));
                    JOptionPane.showMessageDialog(null, ""
                        + "Tamanho da base: " + retangulo.getBase() + "\n"
                        + "Area do Quadrado: " + quadrado.calcularArea() + "\n");
                    retangulo.add(retangulo);
                }                    
            } catch (Exception e){
                JOptionPane
            }
        }
    }
}
