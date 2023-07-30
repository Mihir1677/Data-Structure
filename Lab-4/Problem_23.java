import java.util.*;

class Employee_Detail{
    int employee_id;
    String name;
    String designation;
    int salary;

    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Detail\n");
        System.out.println("Enter Employee ID: ");
        employee_id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        name = sc.next();
        System.out.println("Enter Employee Designation: ");
        designation = sc.next();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextInt();
        }

    void printDetail(){
        System.out.println("\nEmployee Detail\nID: "+employee_id+"\nName: "+name+"\nDesignation: "+designation+"\nSalary: "+salary);
    }
}

public class Problem_23{
    public static void main(String[] args){


        Employee_Detail emp = new Employee_Detail();
        emp.getDetails();
        emp.printDetail();
    }
}