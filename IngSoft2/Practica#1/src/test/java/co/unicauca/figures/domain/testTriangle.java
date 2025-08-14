package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brada
 */
public class testTriangle {
    
    public testTriangle() {
    }
    
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        Triangle triangle = new Triangle(3);
        double expResult = 9;
        double result = triangle.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        Triangle triangle = new Triangle(4);
        double expResult = (Math.sqrt(3) / 4) * Math.pow(4, 2);
        double result = triangle.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
