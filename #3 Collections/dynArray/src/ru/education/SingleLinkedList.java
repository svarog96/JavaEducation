package ru.education;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by glebus on 31.07.17.
 */
public class SingleLinkedList {
    public static void main(String[] args) {
        Node tail = null;

        for(int k = 0; k < 10; k++){
            tail = new Node(k, tail);
        }

        Node ref = tail;
        while(ref != null){
            ref = ref.next;
        }

        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));
    }

    public static String toStringIter(Node ref){
        String result = "";
        while (ref != null){
            result += "(" + ref.value + ")->";
            ref = ref.next;
        }
        result += "null";
        return result;
    }

    public static String toStringRec(Node ref){
        if(ref == null){
            return null;
        }
        else{
            return "(" + ref.value + ")->" + toStringRec(ref.next);
        }
    }
}
