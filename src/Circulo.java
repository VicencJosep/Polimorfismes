public class Circulo extends Figura{
    private double r;
    public Circulo (double r)
    {
        this.r=r;
    }
    @Override
    public double area ()
    {
        return (Math.PI)*r*r;
    }
}
