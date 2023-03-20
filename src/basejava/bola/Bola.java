package basejava.bola;

public class Bola {
        public String cor;
//        public Float circ; 10.5F
        public double circ; //10.5 ocupa mais espaço, mais não necessita por a letra F
        public String material;

        public void trocaCor(String cor) {
            this.cor = cor;
        }

        public String mostrarCor(){
            return cor;
        }
        public void trocaCirc(double circ) {
            this.circ = circ;
        }

        public double mostrarCirc(){
            return circ;
        }
        public void trocaMaterial(String material) {
            this.material = material;
        }

        public String mostrarMaterial(){
            return material;
        }

}
