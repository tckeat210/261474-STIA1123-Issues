package my.issues.issue10;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Array {
  public static void displayStates(){
   List<String> stateList = Arrays.asList("Pahang","Penang","Melaka","Johor","Kedah");
   ListIterator<String> myListIterator = stateList.listIterator();
      while (myListIterator.hasNext()){
      System.out.println(myListIterator.next());
      }
   }

}
