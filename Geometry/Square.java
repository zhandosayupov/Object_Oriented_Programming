package Geometry;

public class Square extends Rectangle{
    Square(){
        super();
    }

    Square(double side){
        super(side, side);
    }

    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
