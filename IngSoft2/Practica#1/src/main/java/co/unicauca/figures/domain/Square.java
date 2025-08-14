package co.unicauca.figures.domain;

/**
 *
 * @author brada
 */
public class Square implements Figure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    
    public void setside(double side) {
        this.side = side;
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * side; 
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
    
            
}
