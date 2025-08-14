package co.unicauca.figures;

import co.unicauca.figures.domain.Circle;
import co.unicauca.figures.domain.Figure;
import co.unicauca.figures.domain.Square;
import co.unicauca.figures.domain.Triangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brada
 */
public class Main {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1);
        Figure fig2 = new Circle(2.3);
        Figure fig3 = new Square(4);
        Figure fig4 = new Square(3.3);
        Figure fig5 = new Triangle(6);
        Figure fig6 = new Triangle(5.3);
        
        //Arreglo polimorfico
        List<Figure> figures = new ArrayList<>() ;
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        figures.add(fig5);
        figures.add(fig6);
        
        
        //Recorremos el arreglo y ejecutamos los metodos polimorficos
        for(Figure fig: figures){
            System.out.println("El area es: " + fig.calculateArea());
            System.out.println("El perimetro es: " + fig.calculatePerimeter());
        }
    }
}
