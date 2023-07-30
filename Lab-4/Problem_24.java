import java.util.*;

class Student_Detail{
    int enrollment_no;
    String name;
    int semester;
    float cpi;


    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Detail\n");
        System.out.println("Enter Enrollment_No: ");
        enrollment_no = sc.nextInt();
        System.out.println("Enter Student Name: ");
        name = sc.next();
        System.out.println("Enter Student Semester: ");
        semester = sc.nextInt();
        System.out.println("Enter Student CPI: ");
        cpi = sc.nextFloat();
        }

    void printDetails(){
        System.out.println("\nStudent Detail\nID: "+enrollment_no+"\nName: "+name+"\nSemester: "+semester+"\nCPI: "+cpi);
    }
}

public class Problem_24{
    public static void main(String[] args){
        Student_Detail stu[] = new Student_Detail[5];
        for(int i=0;i<5;i++){
            stu[i] = new Student_Detail();
            stu[i].getDetails();
            System.out.println("\n");
        }
        for(int i=0;i<5;i++){
            stu[i].printDetails();
            System.out.println("\n");
        }
    }
}