//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    // Function to reverse a linked list
    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    // Function to add two numbers represented by linked lists
    static Node addTwoLists(Node num1, Node num2) {
        // Reverse both input lists
        num1 = reverse(num1);
        num2 = reverse(num2);

        // Create a dummy node to help build the result list
        Node res = new Node(0);
        Node ptr = res;
        int carry = 0;
        Node t1 = num1;
        Node t2 = num2;

        // Loop through both lists
        while (t1 != null || t2 != null) {
            int sum = carry;
            if (t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            ptr.next = new Node(sum);
            ptr = ptr.next;
        }

        // If there's still a carry left, add a new node for it
        if (carry > 0) {
            ptr.next = new Node(carry);
        }

        // Reverse the result list to get the final sum in the correct order
        res = reverse(res.next); // Skip the dummy node and reverse the actual result

        return res;
    }
}


//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        }
    }
}

// } Driver Code Ends