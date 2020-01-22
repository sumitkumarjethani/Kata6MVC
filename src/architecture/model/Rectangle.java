package architecture.model;

public class Rectangle extends Figure{
    
    private double base;
    private double heigth;
    private Point position;

    public Rectangle(double base, double heigth, Point position) {
        this.base = base;
        this.heigth = heigth;
        this.position = position;
    }
    
    public double getBase() {
        return base;
    }

    public double getHeigth() {
        return heigth;
    }
    
    public Point getPosition(){
        return this.position;
    }
    
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    public void setPosition(Point position){
        this.position =  position;
    }
    
    @Override
    public String getName(){
        return "Rectangle";
    }
}
