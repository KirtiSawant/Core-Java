import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

    public static void main(String[] args) {

    	Set<String> setA = new HashSet<>();

    	setA.add("element 1");
    	setA.add("element 2");
    	setA.add("element 3");
    	System.out.println(setA);
    	setA.remove("element 2");
    	System.out.println(setA);
    	setA.clear();
    	System.out.println(setA);
    	
    	//Add All Elements From Another Collection
    	Set<String> set = new HashSet<>();
    	set.add("one");
    	set.add("two");
    	set.add("three");
    	System.out.println(set);
    	Set<String> set2 = new HashSet<>();
    	set2.add("four");
    	set2.addAll(set);
    	System.out.println(set2);
    	//Remove All Elements From Another Collection
    	Set<String> set3 = new HashSet<>();
    	set3.add("one");
    	set3.add("two");
    	set3.add("three");
    	System.out.println(set3);
    	Set<String> set4 = new HashSet<String>();
    	set4.add("three");
    	
    	set3.removeAll(set4);
    	System.out.println(set4);
    	//Retain All Elements Present in Another Collection
    	Set<String> setB = new HashSet<>();
    	setB.add("one");
    	setB.add("two");
    	setB.add("three");
    	System.out.println(setB);
    	
    	Set<String> setC = new HashSet<>();
    	setC.add("three");
    	setC.add("four");
    	setB.retainAll(setC);
    	System.out.println(setC);
    	//size
    	Set<String> set5 = new HashSet<>();

    	set5.add("123");
    	set5.add("456");
    	set5.add("789");
    	int size = set5.size();
    	System.out.println(size);
    	
    	
    	
    }
}