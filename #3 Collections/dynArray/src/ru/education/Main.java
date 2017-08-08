package ru.education;

import java.util.Arrays;

/**
 * Created by glebus on 28.07.17.
 */
public class Main {
    public static void main(String[] args) {

        /**--emulate Array List**/
        DynamicArray dynArray = new DynamicArray();

        dynArray.add(5);
        dynArray.add(7);

        System.out.println(Arrays.toString(dynArray.data));

        /**emulate Linked List**/

        /*-----1
        Node node0 = new Node(0, null);
        Node node1 = new Node(0, null);
        Node node2 = new Node(0, null);
        Node node3 = new Node(0, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        */

        /*-----2
        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node node0 = new Node(0, node1);
        */

        /*-----3
        Node node0 = new Node(0, new Node(1, new Node(2, new Node(3, null))));
        */

        Node node0 = node(0, node(1, node(2, node(3, null))));

        Node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
    /*Factory pattern*/
    static Node node(int value, Node next){
        return new Node(value,next);
    }
}
