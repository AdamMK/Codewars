import java.util.Arrays;

//retuns Mean of ints in the array
public class MeanOfArray {

    public static int getAverage(int[] marks){

//        int sum = 0;
//        for( int i:marks) {
//            sum += i;
//        }
//        return sum / marks.length;

        return (int) Arrays.stream(marks).average().orElse(Double.NaN);
    }

    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {2,3,4,5,5,5}));
    }
}
