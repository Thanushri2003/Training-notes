package com.mphasis.Javaprograms;
import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        
        l.add("thanu");
        l.add("hiii");
        l.add("hiiiiiii");
        l.add("sundari");

        System.out.println("Original List: " + l);

        ListIterator<String> i = l.listIterator();
        
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
        
        System.out.println("Modified List: " + l);
    }
}
