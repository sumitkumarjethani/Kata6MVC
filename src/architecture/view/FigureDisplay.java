package architecture.view;

import architecture.model.Point;

public interface FigureDisplay {
    public void display(Point[] points, Point position);
    public Point getDisplaySize();
}
