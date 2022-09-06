package clases;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayString {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<String>();
        arrayListString.add("Miguel");
        arrayListString.add("Alan");
        arrayListString.add("MARCOS");
        arrayListString.add("Jean Pierre");

        LinkedList<String> linkedListString = new LinkedList<String>(arrayListString);


        for (int i = 0; i < arrayListString.size(); i++) {
            System.out.println("Cada valor en la ArrayList: " + i + arrayListString.get(i));
        }
        for (int i = 0; i < linkedListString.size(); i++) {
            System.out.println("Cada valor en la LinkedList: " + i + linkedListString.get(i));
        }
    }
}
