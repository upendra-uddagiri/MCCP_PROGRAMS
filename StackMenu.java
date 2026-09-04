import java.util.*;
public class StackMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Size");
            System.out.println("6. Is Empty");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int element = sc.nextInt();
                    s.push(element);
                    System.out.println(element + " pushed into stack");
                    break;
                case 2:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Popped element: " + s.pop());
                    }
                    break;
                case 3:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack: " + s);
                    }
                    break;
                case 4:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top element: " + s.peek());
                    }
                    break;
                case 5:
                    System.out.println("Stack size: " + s.size());
                    break;
                case 6:
                    System.out.println("Is stack empty? " + s.isEmpty());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}