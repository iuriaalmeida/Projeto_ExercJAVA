package basejava.contcorrente;

public class ContCorrente {
    private int numero;
    private String nome;
    private double saldo;

    public ContCorrente(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    public ContCorrente(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0f;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDeposito(double valor) {
        this.saldo += valor;
    }
    public void setSaque(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }
    public String toString() {
        return "Conta [numero= " + numero + ", nome= " + nome + ", saldo= " + saldo + "]";
    }
}
