package maxNumberIn2DArr;


public class arr {
    public static double sum (double [] [] m, int column) {

        double sum = 0;

        for (double[] row : m) {
            if(Double.toString(row[column]) != null){
                sum += row[column];
            }
        }

        return sum;
    }
    public static int [] locateLargest(double[][] a){
     double maximum = a[0][0];
     int locationX = 0;
     int locationY = 0;
     int countX = 0;
     int countY = 0;
        for(double[] row : a){
            countY++;
            for(double col : row){
                if(maximum < col){
                    maximum = col;
                    locationX = countX;
                    locationY = countY;
                }
                else {
                    continue;
                }
                countX++;
            }
        }
        int [] location = {locationX, locationY};
     return location;
    }
}
