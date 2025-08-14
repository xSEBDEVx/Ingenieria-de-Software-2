package co.unicauca.figures.domain;

/**
 *
 * @author brada
 */
public class Triangle implements Figure{
    private double side;

    public Triangle(double side) {
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
        return side + side + side; 
    }

    @Override
    public double calculateArea() {
    return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
    
            
}
