public class Rectangle {
    public double length;
    public double width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return width*length;
    }
}