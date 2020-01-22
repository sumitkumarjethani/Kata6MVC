package main;

import architecture.controller.LeftCommand;
import architecture.controller.RightCommand;
import architecture.model.Point;
import architecture.model.Rectangle;
import architecture.view.FigureDialog;
import architecture.view.FigureDisplay;
import swing.SwingRectangleDialog;
import swing.SwingRectangleDisplay;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50,10,new Point(100,100));
        MainFrame mainFrame = new MainFrame();
        FigureDisplay figureDisplay = new SwingRectangleDisplay();
        FigureDialog figureDialog = new SwingRectangleDialog();
        mainFrame.addSwingRectangleDisplay((SwingRectangleDisplay)figureDisplay);
        mainFrame.addSwingRectangleDialog((SwingRectangleDialog)figureDialog);
        mainFrame.addCommand("Left", new LeftCommand(figureDisplay,figureDialog,rectangle));
        mainFrame.addCommand("Right", new RightCommand(figureDisplay,figureDialog,rectangle));
        mainFrame.execute();
    }
    
}
