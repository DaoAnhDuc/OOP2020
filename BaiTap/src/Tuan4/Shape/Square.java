package Tuan4.Shape;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide() {
        if(super.getLength() == super.getWidth()){
            return super.getLength();
        }else{
            return 0;
        }
    }
    public void setSize(double size){
        super.setLength(size);
        super.setWidth(size);
    }

    @Override
    public void setLength(double size) {
        super.setLength(size);
    }

    @Override
    public void setWidth(double size) {
        super.setWidth(size);
    }

    @Override
    public String toString() {
        return "Square[" +
                "size=" + getSide() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
