package rockpaperscissors;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.next();
        System.out.println(isValid(choice));
    }

    public static String isValid(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> set = new Stack();
        for (Character ch : arr) {
            if (ch == '{' || ch == '[' || ch == '(') {
                set.push(ch);
            } else if (ch == ']') {
                if (set.isEmpty() || set.peek() != '[') {
                    return "False";
                }
                set.pop();
            } else if (ch == ')') {
                if (set.isEmpty() || set.peek() != '(') {
                    return "False";
                }
                set.pop();
            } else if (ch == '}') {
                if (set.isEmpty() || set.peek() != '{') {
                    return "False";
                }
                set.pop();
            }
        }
        return "True";
    }
}