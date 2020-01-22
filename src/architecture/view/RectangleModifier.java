package architecture.view;

import architecture.model.Point;
import architecture.model.Rectangle;
import java.awt.Component;
import javax.swing.JOptionPane;

public class RectangleModifier {

    public Point changePositionLeft(Rectangle rectangle, FigureDisplay figureDisplay, FigureDialog figureDialog){
        Point[] points = figureDialog.getPoints();
        Point displaySize = figureDisplay.getDisplaySize();
        if(points[0].getX() < displaySize.getX() && points[0].getY() < displaySize.getY()){
            if(rectangle.getPosition().getX() - 10 > 0){
                Point point = new Point(rectangle.getPosition().getX()-10,rectangle.getPosition().getY());
                return point;
            }
        }else{
            JOptionPane.showMessageDialog((Component)figureDisplay, "The rectangle does not fits in the screen");
        }
        return rectangle.getPosition();
    }
    
    public Point changePositionRight(Rectangle rectangle, FigureDisplay figureDisplay, FigureDialog figureDialog){
        Point[] points = figureDialog.getPoints();
        Point displaySize = figureDisplay.getDisplaySize();
        if(points[0].getX() < displaySize.getX() && points[0].getY() < displaySize.getY()){
            if(displaySize.getX() - (rectangle.getPosition().getX() + rectangle.getBase()) > 10){
                Point point = new Point((rectangle.getPosition().getX() + 10),rectangle.getPosition().getY());
                return point;
            }
        }else{
            JOptionPane.showMessageDialog((Component) figureDisplay, "The rectangle does not fits in the screen");
        }
        return rectangle.getPosition();
    }
    
    
}
