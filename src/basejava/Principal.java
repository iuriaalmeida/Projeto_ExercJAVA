package basejava;

public class Principal {

    public static void main(String[] args) {
//        int valor = 3;
//        
//        if (valor % 2 == 0){
//            System.out.print("PAR");
//        }else{
//            System.err.print("IMPAR");
//        };
        
        Numero numero = new Numero();
        numero.valor = 4;
        System.out.println(numero.parImpar());

        System.out.println(numero.maior(7, 5));

        System.out.println(numero.ordemcresc(9, 2, 7));
    }
}
