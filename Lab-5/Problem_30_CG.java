import java.util.*;

public class Problem_30_CG{

    public static boolean isStringOfForm(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == 'a') {
                stack.push(c);
            } else if (c == 'b') {
                if (!stack.isEmpty() && stack.peek() == 'a') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isStringOfForm(input)) {
            System.out.println("String \"" + input + "\" is of the form 'aib^i'.");
        } else {
            System.out.println("String \"" + input + "\" is not of the form 'aib^i'.");
        }
    }
}
