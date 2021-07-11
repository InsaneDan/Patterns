package Visitor.visitor;

import Visitor.shapes.Circle;
import Visitor.shapes.CompoundShape;
import Visitor.shapes.Dot;
import Visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
