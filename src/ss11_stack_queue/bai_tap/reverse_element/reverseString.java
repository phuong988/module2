package src.ss11_stack_queue.bai_tap.reverse_element;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String string = "xin chào   các  bạn";
        String[] words = string.split(" ");


        Stack<String> list = new Stack<>();
        Stack<String> list2 = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()){
                continue;
            }
            list.push(words[i]);

        }
        System.out.println(list);

        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()){
                continue;
            }
            words[i] = list.pop();
            list2.push(words[i]);
        }
        String result = String.join(" ", list2);
        System.out.println(result);
    }
}
