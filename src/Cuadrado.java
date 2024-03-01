    public class Cuadrado extends Rectangulo {
        private double l;
        public Cuadrado(double l){
            this.l = l;
        }
        public double area(){
            return this.l*this.l;
        }
    }
