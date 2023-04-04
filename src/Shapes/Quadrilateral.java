package Shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    protected double SqLength;
    public Quadrilateral(double length, double width){
            this.length = length;
            this.width = width;
            this.SqLength = -1;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public double getSqLength(){
        return SqLength;
    }
    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public abstract void setSqLength(double SqLength);
}
