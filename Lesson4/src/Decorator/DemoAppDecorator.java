package Decorator;

import Decorator.components.Circle;
import Decorator.components.Shape;
import Decorator.components.Triangle;
import Decorator.decorators.BorderWidthDecorator;
import Decorator.decorators.ColorDecorator;

public class DemoAppDecorator {

    public static void main(String[] args) {

        System.out.println("==========");
        System.out.println("Single circle");
        new Circle().draw();

        System.out.println("==========");
        System.out.println("Yellow triangle");
        new ColorDecorator(new Triangle(), "yellow").draw();

        System.out.println("==========");
        System.out.println("Red star with border of 10px");
        new BorderWidthDecorator(new ColorDecorator(new Triangle(), "yellow"), 10).draw();

        System.out.println("==========");
        System.out.println("The same red star with border of 10px (change decoration order)");
        new ColorDecorator(new BorderWidthDecorator(new Triangle(), 10), "yellow").draw();
    }
}

/* РЕЗУЛЬТАТ (консоль):

==========
Single circle
Drawing shape: Circle
==========
Yellow triangle
Drawing shape: Triangle
Color: yellow
==========
Red star with border of 10px
Drawing shape: Triangle
Color: yellow
Border width: 10px
==========
The same red star with border of 10px (change decoration order)
Drawing shape: Triangle
Border width: 10px
Color: yellow

*/