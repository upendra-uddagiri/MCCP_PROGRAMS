import java.util.*;

public class QueueMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
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
                    q.offer(element);
                    System.out.println(element + " added to queue");
                    break;

                case 2:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Removed element: " + q.poll());
                    }
                    break;

                case 3:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue: " + q);
                    }
                    break;

                case 4:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Front element: " + q.peek());
                    }
                    break;

                case 5:
                    System.out.println("Queue size: " + q.size());
                    break;

                case 6:
                    System.out.println("Is queue empty? " + q.isEmpty());
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