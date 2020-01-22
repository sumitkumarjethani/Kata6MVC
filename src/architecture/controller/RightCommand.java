package architecture.controller;

import architecture.model.Point;
import architecture.model.Rectangle;
import architecture.view.FigureDialog;
import architecture.view.FigureDisplay;
import architecture.view.RectangleModifier;

public class RightCommand implements Command{

    private final FigureDisplay figureDisplay;
    private final FigureDialog figureDialog;
    private final Rectangle rectangle;
    
    public RightCommand(FigureDisplay figureDisplay,FigureDialog figureDialog, Rectangle rectangle){
        this.figureDisplay = figureDisplay;
        this.figureDialog = figureDialog;
        this.rectangle = rectangle;
    }

        @Override
    public void execute() {
        Point[] points = this.figureDialog.getPoints();
        Point position = new RectangleModifier().changePositionRight(this.rectangle, this.figureDisplay, this.figureDialog);
        this.rectangle.setBase(points[0].getX());
        this.rectangle.setHeigth(points[0].getY());
        this.rectangle.setPosition(position);
        this.figureDisplay.display(points, position);
    }
}
