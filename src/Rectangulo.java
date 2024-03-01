    public class Rectangulo extends Figura{
        private double l1,l2;

        public Rectangulo()
        {}
        public Rectangulo(double l1,double l2){
            super();
            this.l1 = l1;
            this.l2=l2;
        }
        @Override
        public double area(){
            return l1*l2;
        }
    }
