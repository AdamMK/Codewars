import java.util.*;

//returns whole words in reversed order
class ReverseWords {

    public static String reverseWords(String str){

        List l = Arrays.asList(str.split(" "));

        Collections.reverse(l);

        return String.join(" ", l);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Adam ma bzika"));
    }
}
