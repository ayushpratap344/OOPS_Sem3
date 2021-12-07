import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
    private int Emp_id;
    private String Emp_name;
    private String Date_of_joining;
    private String Emp_Dep;

    Employee(int Emp_id, String Emp_name, String Date_of_joining, String Department) {
        this.Emp_id = Emp_id;
        this.Emp_name = Emp_name;
        this.Date_of_joining = Date_of_joining;
        this.Emp_Dep = Department;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public String getDate_of_joining() {
        return Date_of_joining;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public String getEmp_Dep() {
        return Emp_Dep;
    }

    public String toString() {
        return Emp_id + " " + Emp_name + " " + Date_of_joining + " " + Emp_Dep;
    }
}

class BT20CSE212 {
    public static void main(String[] args) {

        List<Employee> c = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.print("Enter Your Choice : ");
            ch = s.nextInt();

            switch (ch) {
            case 1:
                System.out.print("Enter Emp_id : ");
                int eno = s.nextInt();
                System.out.print("Enter EmpName : ");
                String Emp_name = s1.next();
                System.out.print("Enter Date_of_joining : ");
                String Date_of_joining = s.next();
                System.out.print("Enter Department : ");
                String Dept = s1.next();

                c.add(new Employee(eno, Emp_name, Date_of_joining, Dept));
                break;

            case 2:
                System.out.println("***************************");
                Iterator<Employee> i = c.iterator();
                while (i.hasNext()) {
                    Employee Emp_temp = i.next();
                    System.out.println(Emp_temp);
                }
                System.out.println("***************************");
                break;
            case 3:
                boolean found = false;
                System.out.print("Enter Emp_id to Search :");
                int Emp_id = s.nextInt();
                System.out.println("***************************");
                i = c.iterator();
                while (i.hasNext()) {
                    Employee Emp_temp = i.next();
                    if (Emp_temp.getEmp_id() == Emp_id) {
                        System.out.println(Emp_temp);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Record Not Found");
                }
                System.out.println("***************************");
                break;
            }
        } while (ch != 0);
    }
}