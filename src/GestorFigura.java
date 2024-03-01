public class GestorFigura  {
    public static double suma(Figura[] v) {

        double sumador = 0;
        for (Figura f : v) {
            sumador = sumador + f.area();
        }
        return sumador;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[1];

        v[0] = new Rectangulo(5, 3);
        //v[1] = new Circulo(5);
        //v[2] = new Cuadrado(5);
        //v[3] = new Circulo(120);

        double res = suma(v);

        System.out.println("suma: " + res);

       // print(v);

        //sort(v);

        //print(v);

    }
}