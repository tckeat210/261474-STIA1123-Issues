package my.issues.issue13;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MyIterator {
    public static void main(String[] args) {


        List<String> stuentheights = Arrays.asList("George is 168cm", "Max is 181cm", "Stephen is 173cm");
        System.out.println("=======>Sudent heights using ListIterator");
        ListIterator<String> myLisIterator = stuentheights.listIterator();
        while (myLisIterator.hasNext()) {
            System.out.println(myLisIterator.next());
        }


        List<String> stuentweights = Arrays.asList("George is 61kg", "Max is 83kg", "Stephen is 68kg");
        System.out.println("\n=======>Student weights using enhanced for loop");
        for (String studweighs : stuentweights) {
            System.out.println(studweighs);
        }

        List<String> studentages = Arrays.asList("George is 21 years old", "Max is 23 years old", "Stephen is 19 years old");
        System.out.println("\n=======>Student ages using a lambda expression");
        studentages.forEach(studages -> System.out.println(studages));

    }
}
