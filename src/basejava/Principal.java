package basejava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
//        int valor = 3;
//        
//        if (valor % 2 == 0){
//            System.out.print("PAR");
//        }else{
//            System.err.print("IMPAR");
//        };
        Scanner scan = new Scanner(System.in);
        Numero numero = new Numero();

        // System.out.print("Digite um numero: ");
        // numero.valor = scan.nextInt();
        // System.out.println(numero.parImpar());

        // System.out.print("Digite o primeiro valor: ");
        // int v1 = scan.nextInt();
        // System.out.print("Digite o segundo valor: ");
        // int v2 = scan.nextInt();
        // System.out.println(numero.maior(v1, v2));

        // System.out.print("Digite o primeiro valor: ");
        // int n1 = scan.nextInt();
        // System.out.print("Digite o segundo valor: ");
        // int n2 = scan.nextInt();
        // System.out.print("Digite o terceiro valor: ");
        // int n3 = scan.nextInt();
        // System.out.println(numero.ordemcresc(n1, n2, n3));

        try {
        numero.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero?"));
        JOptionPane.showMessageDialog(null, "O numero é " + numero.parImpar());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!");
        }
    }
}
