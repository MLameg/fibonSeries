public class fibonSeries {

    public static void main(String[] args){

        int[] series = new int[21];

        int left = 0;
        int middle = 1;
        int right = 0;

        for(int i = 0; i<20; i++){
            right = left + middle;
            left = middle;
            middle = right;
            series[i+2] = right;
            System.out.println(series[i+2]);
        }




    }
}
