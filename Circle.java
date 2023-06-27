package aula2706;

public class Circle implements GeometricObject{
    protected double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getPerimeter(){
        return 2 * (3.1415) * this.radius;
    }
    
    public double getArea(){
        return 3.1415 * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
