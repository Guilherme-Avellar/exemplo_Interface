package aula2706;

public class Aula2706 {

    public static void main(String[] args) {
        Circle circulo = new Circle(4);
        ResizableCircle circulo2 = new ResizableCircle(10);
        
        
        System.out.println("\nCirculo:\n"
                + "area: " + circulo.getArea()
                +"\nperimetro: " + circulo.getPerimeter());
        
        System.out.println("toString: " + circulo.toString());
        
        System.out.println("\nCirculo 2:\n"
                + "area: " + circulo2.getArea()
                +"\nperimetro: " + circulo2.getPerimeter());
        
        circulo2.resize(20);
        System.out.println("toString: " + circulo2.toString());
        
        
    }
    
}
