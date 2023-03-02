package modelbaseddevelopment.enumerator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class AdapterIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Adapter - ");
        list.add("Facade - ");
        list.add("Pattern");
        list.add("rules");
        list.add("into");
        list.add("Java");
        list.add("Patterns");
        list.add("!");

        System.out.println("The list is: \n " + list);

        Iterator<String> iter = list.iterator();
        Enumeration ite = new IteratorToEnumeration(iter);

        System.out.println("\nThe iterator values of list are: ");
        while (iter.hasNext()) {
            System.out.print(ite.nextElement() + " ");
        }
    }
}

//congreso-348/
