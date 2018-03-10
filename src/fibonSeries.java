import java.util.Arrays;

public class fibonSeries {

    public static void main(String[] args){

        int[] series = new int[20];

        int left = 0;
        int middle = 1;
        int right;

        for(int i = 0; i<20; i++){

            series[i] = left;
            right = left + middle;
            left = middle;
            middle = right;

        }

        System.out.println(Arrays.toString(series));
    }
}
