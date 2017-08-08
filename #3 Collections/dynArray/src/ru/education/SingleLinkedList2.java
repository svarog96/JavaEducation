package ru.education;

/**
 * Created by glebus on 31.07.17.
 */
public class SingleLinkedList2 {
    public static void main(String[] args) {
        Node tailA = generateIterA(9);
        Node tail0 = generateIterB(9);

        Node tailB = generateRec0(9);

        Node tail1 = new Node(9, null);
        generateRec1(tail1);

        System.out.println(toStringRec(tailA));
        System.out.println(toStringRec(tailB));
        System.out.println(toStringIter(tail0));
        System.out.println(toStringIter(tail1));
    }

    public static Node generateIterA(int max){
        Node result = null;
        for(int k = 0; k <= max; k++){
            result = new Node(k, result);
        }
        return result;
    }

    public static Node generateIterB(int  max){
        Node tail = new Node(max, null);
        Node head = tail;

        for(int k = max; k > 0; k--) {
            head.next = new Node(k - 1, null);
            head = head.next;
        }
        return tail;
    }

    public static Node generateRec0(int value){
        if(value >= 0)
            return new Node(value, generateRec0(value - 1));
        else
            return null;
    }

    public static void generateRec1(Node node) {
        if(node.value > 0){
            node.next = new Node(node.value - 1, null);
            generateRec1(node.next);
        }
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
