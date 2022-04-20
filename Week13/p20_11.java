package Week13;

import java.util.Scanner;
import java.util.Stack;

public class p20_11 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            Character cur = text.charAt(i);
            if(cur == '(') {
                s.push(cur);
            }
            else if(cur == '{') {
                s.push(cur);
            }
            else if(cur == '[') {
                s.push(cur);
            }
            else if(cur == ')') {
                if(s.empty() | s.peek() != '(') {
                    flag = false;
                    break;
                }
                else{
                    s.pop();
                }
            }
            else if(cur == '}') {
                if(s.empty() | s.peek() != '{') {
                    flag = false;
                    break;
                }
                else{
                    s.pop();
                }
            }
            else if(cur == ']') {
                if(s.empty() | s.peek() != '[') {
                    flag = false;
                    break;
                }
                else{
                    s.pop();
                }
            }
        }
        if(!s.empty()) {
            flag = false;
        }
        System.out.println(flag);
    }
}
