package OctArch;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){

        n = 4;
        side = 3;
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
        double a = (n * Math.pow(n,2) / (4 * Math.tan(Math.PI / n)));
        return "Area: " + a;
    }
}
