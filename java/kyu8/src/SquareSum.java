import java.util.Arrays;

//returns sum of squared elements in the table
public class SquareSum {

    static int squareSum(int[] ns) {

//        int sum = 0;
//        for(int number:ns){
//           sum += number*number;
//        }
//        return sum;

    return (int) Arrays.stream(ns).map(n -> n * n).sum();
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {2,5,5,5}));
    }
}
