package basejava.retangulo;

public class Retangulo {
    private float base;
    private float altura;

    public void setBase(float base){
        if (base > 0)
            this.base = base;
    }
    public float getBase(){
        return this.base;
    }
    public void setAltura(float altura){
        if (altura > 0)
            this.altura = altura;
    }
    public float getAltura(){
        return this.altura;
    }
    public float calcularArea(){
        return base * altura;
    }
    public float calcularPeri(){
        return 2 * (base + altura);
    }
}
