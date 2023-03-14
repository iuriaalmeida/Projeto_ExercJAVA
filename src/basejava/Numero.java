package basejava;

public class Numero {
   
    int valor;
    
    public String parImpar(){
        if (this.valor % 2 == 0){
            return "PAR";
        }else{
            return "IMPAR";
        }
            
    }
    public String parImpar(){

    }

    public int maior(int v1, int v2){
        if(v1 > v2){
            return v1;
        }
            return v2;
    }
    public String ordemcresc(int n1, int n2, int n3){
        if(n1>n2>n3){
            return n1 - n2 - n3
        } if(n1<n2<n3){
            return n3 - n2 - n1
        } if(n2>n1>n3){
            return n2 - n1 - n3
        } if(n2<n1<n3){
            return n3 - n1 - n2
        }
    }
}
