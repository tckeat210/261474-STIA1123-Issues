package my.issues.issue10;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

    public class MyIterator{

        public static void main(String[] args){

            List<String> stateList = Arrays.asList("Pahang","Penang","Melaka","Johor","Kedah");

            System.out.println("======> 1. using ListIterator");
            ListIterator<String> myListIterator = stateList.listIterator();
            while (myListIterator.hasNext()){
                System.out.println(myListIterator.next());
            }

            System.out.println("======> 2. using Iterator");
            Iterator<String> myIterator = stateList.iterator();
            while (myIterator.hasNext()){
                System.out.println(myIterator.next());
            }

            System.out.println("======> 3. using simple for loop");
            for (int i = 0; i < stateList.size(); i++){
                System.out.println(stateList.get(i));
            }

            System.out.println("======> 4. using enhanced for loop");
            for(String state : stateList)
                System.out.println(state);

            System.out.println("======> 5. using while loop");
            int i = 0;
            while (stateList.size() > i){
                System.out.println(stateList.get(i++));
            }

            System.out.println("======> 6. using lambda expression");
            stateList.forEach(state -> System.out.println(state));

            System.out.println("======> 7. using method reference");
            stateList.forEach(System.out::println);
        }
    }
}
