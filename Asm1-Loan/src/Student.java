import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
public class Student
{
    ArrayList<Student> students = new ArrayList<Student>();
    int ID;
    String name;
    int age;
    String gender;
    String email;
    Student(){}
    void Initial()
    {
        for (int i = 0; i < 5; i++)
        {
            Student stu = new Student();
            stu.ID = i;
            stu.name = "student" + i;
            stu.email = "student" + i + "@gmail.com";
            if (i % 2 == 0)
            {
                stu.gender = "Male";
            }
            else
            {
                stu.gender = "Female";
            }
            Random rd = new Random();
            stu.age = 18 + rd.nextInt(10);
            students.add(stu);
        }
    }
    String ToString()
    {
        return "Student ID:" + ID + "\tName:" + name + "\tGender:" + gender + "\tAge:" + age + "\tEmail: " + email;
    }
    void PrintList()
    {
        System.out.println();
        System.out.println("\t Student information list");
        System.out.println("\t********************");
        for (Student student : students)
        {
            System.out.println(student.ToString());
        }
    }
    void CheckAge()
    {
        System.out.println("All students having age greater than 20 are: ");
        for (Student student : students)
        {
            if(student.age > 20)
            {
                System.out.println(student.ToString());
            }
        }
    }
    void FindStudent(int id)
    {
        System.out.println("The student who has ID = " + id + "is:");
        for (Student student : students)
        {
            if(student.ID == id)
            {
                System.out.println(student.ToString());
            }
        }

    }
    void InsertStudent(int id, Student stu)
    {
        students.add(id, stu);
    }
    void DeleteStudent(String name)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).name.equals(name))
            {
                students.remove(i);
            }
        }
    }
    void SortName()
    {
        System.out.println("The list after sorting: ");
        Collections.sort(students, new Comparator<Student>()
                {
                    public int compare(Student stu1, Student stu2)
                    {
                        return (stu1.name.compareTo(stu2.name));
                    }
                }
        );
    }
    void DisplayMenu()
    {
        System.out.println("\t\tMENU");
        System.out.println("1. View the list.");
        System.out.println("2. View students having age > 20.");
        System.out.println("3. Find student using ID.");
        System.out.println("4. Add new student.");
        System.out.println("5. Remove student.");
        System.out.println("6. Sort the list of students.");
        System.out.print("Please enter your choice: ");
    }
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        stu.Initial();
        int selection = 0;
        do
        {
            stu.DisplayMenu();
            selection = sc.nextInt();
            switch (selection)
            {
                case 1:
                    stu.PrintList();
                    break;
                case 2:
                    stu.CheckAge();
                    break;
                case 3:
                    System.out.print("Enter ID of the student: ");
                    int id = sc.nextInt();
                    stu.FindStudent(id);
                    break;
                case 4:
                    System.out.print("Enter the position you want to add: ");
                    int pos = sc.nextInt();
                    System.out.print("\nEnter ID: ");
                    stu.ID = sc.nextInt();
                    System.out.print("\nEnter name: ");
                    stu.name = sc.next();
                    System.out.print("\nEnter gender: ");
                    stu.gender = sc.next();
                    System.out.print("\nEnter age: ");
                    stu.age = sc.nextInt();
                    System.out.print("\nEnter email: ");
                    stu.email = sc.next();
                    stu.InsertStudent(pos, stu);
                    break;
                case 5:
                    System.out.print("Enter name of the student you want to remove: ");
                    String name = sc.next();
                    stu.DeleteStudent(name);
                    stu.PrintList();
                    break;
                case 6:
                    stu.SortName();
                    stu.PrintList();
                    break;
                default:
                    System.out.println("Exit the program successfully!");
                    break;
            }
        }
        while(selection > 0 & selection < 7);
    }
}
