package swing;

import architecture.view.FigureDisplay;
import architecture.model.Point;
import javax.swing.JPanel;

public class SwingRectangleDisplay extends JPanel implements FigureDisplay{
    
    private Point rectangle;
    private Point position;
    
    public SwingRectangleDisplay(){
        this.setSize(400,300);
    }
    
    @Override
    public void display(Point[] points, Point position) {
        this.rectangle = points[0];
        this.position = position;
        this.getGraphics().clearRect(0, 0, this.getWidth(), this.getHeight());
        this.getGraphics().drawRect((int)this.position.getX(), (int)this.position.getY(), (int)this.rectangle.getX(), (int)this.rectangle.getY());
        this.getGraphics().fillRect((int)this.position.getX(), (int)this.position.getY(), (int)this.rectangle.getX(), (int)this.rectangle.getY());
    }
    
    @Override
    public Point getDisplaySize(){
        return new Point(this.getWidth(),this.getHeight());
    }
}
