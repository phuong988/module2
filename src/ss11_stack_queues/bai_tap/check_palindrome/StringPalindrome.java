package src.ss11_stack_queues.bai_tap.check_palindrome;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi:");
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean checkPalindrome = true;
        for (char character : string.toCharArray()) {
            stack.push(character);
            queue.offer(character);
        }
        for (int i = 0; i < string.length(); i++) {
            stack1.push(stack.pop());
            if (stack1.get(i) != queue.poll()) {
                checkPalindrome = false;
                break;
            }
        }
        if (checkPalindrome) {
            System.out.println("chuỗi vùa nhập là chuỗi palindrome");
        } else {
            System.out.println("chuỗi vừa nhập k phải là chuỗi palindrome");
        }


    }
}
