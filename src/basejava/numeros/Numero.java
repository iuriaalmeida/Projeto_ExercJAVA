package basejava.numeros;

public class Numero {
   
    int valor;
    
    public String parImpar(){
        if (this.valor % 2 == 0){
            return "PAR";
        }else{
            return "IMPAR";
        }
            
    }
    public String parImpar(int valor){
        if (valor % 2 == 0){
            return "PAR";
        }else{
            return "IMPAR";
        }

    }

// 1) Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

    public int maior(int v1, int v2){
        if(v1 > v2){
            return v1;
        }
            return v2;
    }
// 2) Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

    public String ordemcresc(int n1, int n2, int n3){
    //     if (n1 > n2 && n2 > n3){
    //         return n1 + "-" + n2 + "-" + n3;    
    //     }
    //     if (n1 > n3 && n3 > n2){
    //         return n1 + "-" + n3 + "-" + n2;    
    //     }
    //     if (n2 > n3 && n3 > n1){
    //         return n1 + "-" + n2 + "-" + n3;    
    //     }
    //     if (n2 > n1 && n1 > n3){
    //         return n1 + "-" + n3 + "-" + n2;    
    //     }
    //     if (n3 > n2 && n2 > n1){
    //         return n3 + "-" + n2 + "-" + n1;    
    //     }
    //         return n3 + "-" + n1 + "-" + n2;    
    //     }

        int temp = 0;
        if (n1 > n2){
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n1>n3){
            temp = n3;
            n3 = n1;
            n1 = temp;
        }
        if (n2 > n3){
            temp = n2;
            n2 = n3;
            n3 = temp;
        }

        return n1 + "-" + n2 + "-" + n3;

    }
}
