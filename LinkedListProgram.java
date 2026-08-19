import java.util.*;
public class LinkedListProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        while (true) {
            System.out.println("\nLINKED LIST PROGRAM:");
            System.out.println("1: Add");
            System.out.println("2: Remove");
            System.out.println("3: Clear");
            System.out.println("4: Get");
            System.out.println("5: Size");
            System.out.println("6: Search / Check");
            System.out.println("7: Exit");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\nADD:");
                    System.out.println("1: Add at position");
                    System.out.println("2: Add first");
                    System.out.println("3: Add last");
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter position: ");
                            int pos = sc.nextInt();
                            System.out.print("Enter data: ");
                            int data = sc.nextInt();
                            ll.add(pos, data);
                            System.out.println("Element added.");
                            break;
                        case 2:
                            System.out.print("Enter data: ");
                            int d = sc.nextInt();
                            ll.addFirst(d);
                            System.out.println("Element added at first.");
                            break;
                        case 3:
                            System.out.print("Enter data: ");
                            int d1 = sc.nextInt();
                            ll.addLast(d1);
                            System.out.println("Element added at last.");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    System.out.println("\nREMOVE:");
                    System.out.println("1: Remove at position");
                    System.out.println("2: Remove first");
                    System.out.println("3: Remove last");
                    System.out.print("Enter your choice: ");
                    int removeChoice = sc.nextInt();
                    switch (removeChoice) {
                        case 1:
                            System.out.print("Enter position: ");
                            int removePos = sc.nextInt();
                            ll.remove(removePos);
                            System.out.println("Element removed.");
                            break;
                        case 2:
                            ll.removeFirst();
                            System.out.println("First element removed.");
                            break;
                        case 3:
                            ll.removeLast();
                            System.out.println("Last element removed.");
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 3:
                    ll.clear();
                    System.out.println("Linked List cleared.");
                    break;
                case 4:
                    System.out.println("\nGET:");
                    System.out.println("1: Get at position");
                    System.out.println("2: Get first");
                    System.out.println("3: Get last");
                    System.out.print("Enter your choice: ");
                    int getChoice = sc.nextInt();
                    switch (getChoice) {
                        case 1:
                            System.out.print("Enter position: ");
                            int getPos = sc.nextInt();
                            System.out.println(
                                "Element: " + ll.get(getPos)
                            );
                            break;
                        case 2:
                            System.out.println(
                                "First element: " + ll.getFirst()
                            );
                            break;
                        case 3:
                            System.out.println(
                                "Last element: " + ll.getLast()
                            );
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 5:
                    System.out.println(
                        "Size of Linked List: " + ll.size()
                    );
                    break;
                case 6:
                    System.out.println("\nSEARCH / CHECK:");
                    System.out.println("1: Contains");
                    System.out.println("2: Is Empty");
                    System.out.println("3: Index Of");
                    System.out.println("4: Last Index Of");
                    System.out.print("Enter your choice: ");
                    int searchChoice = sc.nextInt();
                    switch (searchChoice) {
                        case 1:
                            System.out.print("Enter element: ");
                            int containsElement = sc.nextInt();

                            System.out.println(
                                "Contains: " +
                                ll.contains(containsElement)
                            );
                            break;
                        case 2:
                            System.out.println(
                                "Is Empty: " + ll.isEmpty()
                            );
                            break;
                        case 3:
                            System.out.print("Enter element: ");
                            int indexElement = sc.nextInt();
                            System.out.println(
                                "First Index: " +
                                ll.indexOf(indexElement)
                            );
                            break;
                        case 4:
                            System.out.print("Enter element: ");
                            int lastIndexElement = sc.nextInt();

                            System.out.println(
                                "Last Index: " +
                                ll.lastIndexOf(lastIndexElement)
                            );
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}