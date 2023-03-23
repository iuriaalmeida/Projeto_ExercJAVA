package basejava.pessoa;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Bryan", 20, 80, 179);
        System.out.println(pessoa.toString());
        pessoa.setEngordar(4);
        System.out.println(pessoa.toString());
        pessoa.setEmagrecer(8);
        System.out.println(pessoa.toString());
        pessoa.setCrescer(2);
        System.out.println(pessoa.toString());
        pessoa.setEnvelhecer(2);
        System.out.println(pessoa.toString());
    }
    
}
