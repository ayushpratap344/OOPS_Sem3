import java.io.*;
import java.util.*;

interface Employee {
    int getEmp_id();
    void setEmp_id();
    void setName();
    String getName();
}

class Employee_regular implements Employee {
    int emp_id;
    String name;

    int getEmp_id() {
        return emp_id;
    }

    void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "\nEmployee Detail :- \nEmployee Id = " + emp_id + "\n" + "Name = " + name + "\n\n";
    }

}

class Employee_contract implements Employee {
    int emp_id;
    String name;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "\nEmployee Detail :- \nEmployee Id = " + emp_id + "\n" + "Name = " + name + "\n\n";
    }

}

public class Main {
    public static void main(String args[]) {
        Employee_contract[] arr_con;
        arr_con = new Employee_contract[5];
        Employee_regular[] arr_reg;
        arr_reg = new Employee_regular[5];
        int con = 0, reg = 0;
        System.out.println("Select a option for next step :- ");
        System.out.print("1.Regular Employee \n2.Contract Employee  \n\nEnter your choice :- ");
        Scanner es = new Scanner(System.in);
        int c = es.nextInt();
        if (c == 2) {
            int choice;
            do {
                System.out.println("Select a option for next step :- ");
                System.out.print(
                        "1.Add a new employee \n2.Display records of all the employees \n3.Search an employee \n4.Exit \n\nEnter your choice :- ");
                Scanner s = new Scanner(System.in);
                choice = s.nextInt();
                switch (choice) {
                case 1:
                    Employee_contract emp = new Employee_contract();
                    // Collecting data of employee
                    System.out.print("\nAssign a Unique Employee Id :- ");
                    Scanner i = new Scanner(System.in);
                    int id = i.nextInt();
                    System.out.print("Enter the Name of new Employee :- ");
                    Scanner i1 = new Scanner(System.in);
                    String name = i1.nextLine();
                    // Setting details of the entered employee
                    emp.setEmp_id(id);
                    emp.setName(name);
                    arr[con] = emp;
                    con++;
                    System.out.println("\n");
                    break;
                case 2:
                    for (int j = 0; j < con; j++)
                        System.out.println(arr_con(j));
                    break;
                case 3:
                    System.out.print("\nEnter the Employee Id of for search :- ");
                    Scanner i4 = new Scanner(System.in);
                    int id1 = i4.nextInt();
                    int f = 0;
                    for (int k = 0; k < con; k++) {
                        Employee_contract temp = arr_con[k];
                        if (temp.getEmp_id() == id1) {
                            System.out.println(arr_con[k]);
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        System.out.println("\nSorry , no such employee works in the company.\n");
                    }
                    break;
                case 4:
                    System.exit(1);
                }
            } while (choice != 4);
        } else {
            int choice1;
            do {
                System.out.println("Select a option for next step :- ");
                System.out.print(
                        "1.Add a new employee \n2.Display records of all the employees \n3.Search an employee \n4.Exit \n\nEnter your choice :- ");
                Scanner s1 = new Scanner(System.in);
                choice1 = s1.nextInt();
                switch (choice1) {
                case 1:
                    Employee_regular emp1 = new Employee_regular();
                    // Collecting data of employee
                    System.out.print("\nAssign a Unique Employee Id :- ");
                    Scanner i4 = new Scanner(System.in);
                    int id1 = i4.nextInt();
                    System.out.print("Enter the Name of new Employee :- ");
                    Scanner i2 = new Scanner(System.in);
                    String name1 = i2.nextLine();
                    // Setting details of the entered employee
                    emp1.setEmp_id(id1);
                    emp.setName(name1);
                    arr[reg] = emp1;
                    reg++;
                    System.out.println("\n");
                    break;
                case 2:
                    for (int j = 0; j < reg; j++)
                        System.out.println(arr_reg(j));
                    break;
                case 3:
                    System.out.print("\nEnter the Employee Id of for search :- ");
                    Scanner i9 = new Scanner(System.in);
                    int id_1 = i9.nextInt();
                    int f = 0;
                    for (int k = 0; k < reg; k++) {
                        Employee_regular temp = arr_reg[k];
                        if (temp.getEmp_id() == id_1) {
                            System.out.println(arr_reg[k]);
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        System.out.println("\nSorry , no such employee works in the company.\n");
                    }
                    break;
                case 4:
                    System.exit(1);
                }
            } while (choice != 4);
        }
    }
}