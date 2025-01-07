package exercicio3;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.base * this.height) /2;
    }
}


