import java.util.*;
public class Program1 {
    static String getGrade(int average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department: ");
        String department = sc.next();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.print("Enter student name: ");
            String name = sc.next();
            hm.put(name, new ArrayList<>());
            System.out.println("Enter marks for 6 subjects:");
            for (int i = 0; i < 6; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                hm.get(name).add(sc.nextInt());
            }
        }
        System.out.println("\nDepartment: " + department);
        Set<String> s = hm.keySet();
        int max = 0;
        String s1 = "";
        for (String x : s) {
            ArrayList<Integer> res = hm.get(x);
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += res.get(j);
            }
            res.add(total);
            res.add(total / 6);
            if (max < total) {
                max = total;
                s1 = x;
            }
        }
        for (String x : s) {
            System.out.println(x + " : ");
            ArrayList<Integer> res = hm.get(x);
            for (int j = 0; j < 8; j++) {
                System.out.print(res.get(j) + "   ");
            }
            int average = res.get(7);
            System.out.println("Grade: " + getGrade(average));
            System.out.println();
        }
        System.out.println("Maximum marks");
        System.out.println(s1 + " : ");
        ArrayList<Integer> res = hm.get(s1);
        for (int j = 0; j < 8; j++) {
            System.out.print(res.get(j) + " , ");
        }
        int average = res.get(7);
        System.out.println("\nGrade: " + getGrade(average));
        sc.close();
    }
}