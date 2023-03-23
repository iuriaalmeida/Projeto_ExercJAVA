package basejava.contcorrente;

public class Principal {
    public static void main(String[] args){
    ContCorrente conta = new ContCorrente(000264, "Iuri", 100.0f);
    System.out.println(conta.toString());
    conta.setNome("Iuri");
    conta.setDeposito(1000);
    System.out.println(conta.toString());
    conta.setSaque(500);
    System.out.println(conta.toString());
    }
}
