package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brada
 */
public class testSquare {
    
    public testSquare() {
    }
    
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        Square square = new Square(4);
        double expResult = 16;
        double result = square.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        Square square = new Square(5);
        double expResult = 25;
        double result = square.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
