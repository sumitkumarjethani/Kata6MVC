package architecture.controller;

import architecture.model.Point;
import architecture.model.Rectangle;
import architecture.view.FigureDialog;
import architecture.view.FigureDisplay;
import architecture.view.RectangleModifier;

public class LeftCommand implements Command{
    
    private final FigureDisplay figureDisplay;
    private final FigureDialog figureDialog;
    private final Rectangle rectangle;
    
    public LeftCommand(FigureDisplay figureDisplay,FigureDialog figureDialog,Rectangle r){
        this.figureDisplay = figureDisplay;
        this.figureDialog = figureDialog;
        this.rectangle = r;
    }
    
    @Override
    public void execute() {
        Point[] points = this.figureDialog.getPoints();
        Point position = new RectangleModifier().changePositionLeft(this.rectangle, this.figureDisplay, this.figureDialog);
        this.rectangle.setBase(points[0].getX());
        this.rectangle.setHeigth(points[0].getY());
        this.rectangle.setPosition(position);
        this.figureDisplay.display(points, position);
    }
    
}
