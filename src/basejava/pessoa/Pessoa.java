package basejava.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public void setEnvelhecer(int anos){
        this.idade += anos;
        if(this.idade < 21)
        crescer(0.5);
    }
    public void setEngordar(double peso){
        this.peso += peso;
    }
    public void setEmagrecer(double peso){
        this.peso -= peso;
    }
    public void setCrescer(double altura){
        this.altura += altura;
    }

    public String toString(){
        return "Pessoa [nome=" +nome+ ", idade=" +idade+
        ", peso=" +peso+ ", altura=" +altura+ "]";
    }
}