import java.util.*;
class Student {
    int rollno;
    String name;
    int total;
    double cgpa;
    Student(int rollno, String name, int total, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.total = total;
        this.cgpa = cgpa;
    }
}
public class Main4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Student>> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String department = sc.next();
            hm.put(department, new ArrayList<>());
            System.out.print("Enter how many students: ");
            int n1 = sc.nextInt();
            for (int j = 0; j < n1; j++) {
                int r = sc.nextInt();
                String na = sc.next();
                int total = sc.nextInt();
                double cgpa = sc.nextDouble();
                Student s = new Student(r, na, total, cgpa);
                hm.get(department).add(s);
            }
        }
        Set<String> s1 = hm.keySet();
        for (String x : s1) {
            System.out.println("\nDepartment: " + x);
            ArrayList<Student> res = hm.get(x);
            Collections.sort(res, (a, b) -> Double.compare(b.cgpa, a.cgpa));
            System.out.println("Number of students: " + res.size());
            for (Student st : res) {
                System.out.println(
                    "Roll No: " + st.rollno +
                    "  Name: " + st.name +
                    "  Total: " + st.total +
                    "  CGPA: " + st.cgpa
                );
            }
        }
        sc.close();
    }
}