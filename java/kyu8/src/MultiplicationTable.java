import java.util.stream.Collectors;
import java.util.stream.IntStream;

//returns multiplication table for the given number
public class MultiplicationTable {

    public static String multiTable(int num) {

//        int[] l = new int[] {1,2,3,4,5,6,7,8,9,10};
//        String result = "";
//
//       for(int i:l) {
//           result += i + " * " + num + " = " + i * num + "\n";
//       }
//
//       return result.trim();

        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> i + " * " + num + " = " + i * num)
                .collect(Collectors.joining("\n"));
    }


    public static void main(String[] args) {
        System.out.print(multiTable(5));
    }

}
