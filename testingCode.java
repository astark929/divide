package maxNumberIn2DArr;

public class testingCode {
    public static void main(String [] args){

        double [] [] test1 = {
                {1.5, 2, 3, 4},
        {5.5, 6, 7, 8},
        {9.5, 1, 3, 1},
        };

        double [] [] test2 = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6},
        };

        System.out.println(main.sum(test1,1));

        int [] result = main.locateLargest(test2);

        for (int i : result){
            System.out.print(i + " ");
        }

    }
}
