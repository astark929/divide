package OctArch;

public class RegularPolygon {
    private int;
    private double side;
    private double;
    private double;

    public RegularPolygon(){

        n = 3;
        side = 1;
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
}
