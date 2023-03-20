package basejava.bola;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args){
        Bola bola = new Bola();
        bola.trocaCor("vermelho");
        bola.trocaCirc(10.5);
        bola.trocaMaterial("metal");

        JOptionPane.showMessageDialog(null, "" 
            + "Cor: " + bola.mostrarCor() + "\n" 
            + "Circunferência: " + bola.mostrarCirc() + "\n" 
            + "Material: " + bola.mostrarMaterial() + "\n");
    }
    
}
