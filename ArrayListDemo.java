import java.util.ArrayList; //for using default generics
import java.util.*;
public class ArrayListDemo {
  public static void main(String args[]) {

  //default classes
  //dynamic array
    //default generics
    ArrayList<Object> arr=new ArrayList<Object>();
    arr.add(989);         //stores the values in an array in the form of index 0 -..
    arr.add(678);
    arr.add("babasaheb");
    arr.add("amazon");
    arr.add("lamborgini");
    arr.add(true);

    System.out.println(arr);

    System.out.println(arr.get(1)); //at index 1 678
    System.out.println(arr.get(4));
    //System.out.println(arr.get(-1));    //negative or index out of range is not allowed

    System.out.println(arr.size()); //lenght of array
    System.out.println("Lowest index: "+0);
    System.out.println("hight index: "+(arr.size()-1));

    //llst with other Collections

    ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(12,34,54,23,45,67,78));
    System.out.println(numbers);

    ArrayList<String> lang=new ArrayList<String>(Arrays.asList("java","pyhon","js","php"));
    System.out.println(lang);
    System.out.println(lang.size());
  }
}
