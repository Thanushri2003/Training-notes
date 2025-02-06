package com.mphasis.Javaprograms;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("thanu");
        list.add("hiii");
        list.add("hiiiiiii");

        System.out.println("Original List: " + list);

        ListIterator<String> i = list.listIterator();
        
        while (i.hasNext()) {
            String s = i.next();
            
            if (s.equals("hiiiiiii")) {
                i.remove();
            } else if (s.equals("thanu")) {
                i.remove();
            } else if (s.equals("hiii")) {
                i.remove();
            }
        }
        
        System.out.println("Modified List: " + list);
    }
	

}

