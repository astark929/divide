package OctArch;

public class RegularPolygon {
    private int 3;
    private double side = 1;
    private double = 0;
    private double = 0;

    public RegularPolygon(){

        n = 4;
        side = 5;
        x = 0;
        y = 0;

    }
    public RegularPolygon(int sides, double length, double cordX, double cordY){
        n = sides;
        side = length;
        x = cordX;
        y = cordY;

    }

    public String getPerimeter(){
        double p  = side * n;
        return "perimeter : " + p ;
    }

    public String getArea(){
        double a = (n * Math.pow(side,2) / (4 * Math.tan(Math.PI / n)));
        return "Area: " + a;
    }
    
    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }    
}
