
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
public class Main
{
    ArrayList<Integer> A = new ArrayList<Integer>();
    void Input(int n)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        for(int i = 0; i < n; i++)
        {
            A.add(rd.nextInt(10)); //Add random number
        }
    }
    void Output()
    {
        for(int i = 0; i < A.size(); i++)
        {
            System.out.print(A.get(i) + ", ");
        }
        System.out.println("\n");
    }
    void Add(int n)
    {
        System.out.println("The array after adding " + n + " at the end:");
        A.add(n);
    }
    void Insert(int n, int pos)
    {
        System.out.println("The array after inserting " + n + " at index " + pos);
                A.add(pos, n);
    }
    void DeleteAll(int n)
    {
        System.out.println("\n\nThe array after deleting all elements which are equal to " + n);
        for(int i = 0; i < A.size(); i++)
        {
            if(A.get(i) == n)
            {
                A.remove(i);
            }
        }}
    void DeleteAElement(int pos)
    {
        System.out.println("The array after deleting element at index " + pos);
                A.remove(pos);
    }
    void Find(int n)
    {
        if(A.contains(n))
        {
            System.out.print("The array contains " + n + " at the position: ");
            for(int i = 0; i < A.size(); i++)
            {
                if(A.get(i) == n)
                {
                    System.out.print(i + ", ");
                }
            }
        }
        else
            System.out.println("The array does not contain: " + n);
    }
    void Count(int x, int y)
    {
        System.out.println("\n\nAll elements that is greater than "+ x + " and smaller than " + y + " are: ");
        for(int i = 0; i < A.size(); i++)
        {
            if(A.get(i) > x & A.get(i) < y)
            {
                System.out.print(A.get(i) + ", ");
            }
        }
    }
    public static void main(String[] args)
    {
        Main AL = new Main();
        AL.Input(10);
        System.out.println("The initial array:");
        AL.Output();
        AL.A.sort(null);
        System.out.println("The array after sorting:");
        AL.Output();
        AL.Add(13);
        AL.Output();
        AL.Insert(12,5);
        AL.Output();
        AL.DeleteAElement(5);
        AL.Output();
        AL.Find(1);
        AL.Count(0, 10);
        AL.DeleteAll(5);
        AL.Output();
    }
}