package at.ac.fhcampuswien;

import java.util.*;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld()
    {
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot()
    {
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals()
    {
        int a,b,c,d,e,f,g,h;
        a = 'Z';
        b = 0xface;
        c = 012;
        d = (int) 80L;
        e = (int) 44e-1f;
        f = (int) 5.5f;
        g = (int) 8.88e1;
        h = (int) 99.9;

        System.out.println(a+b+c+d+e+f+g+h);
        // input your solution here
    }

    //todo Task 4
     public void addTwoNumbers()
    {
        Scanner Task4_1 = new Scanner(System.in);
        int x = Task4_1.nextInt();

        int y = Task4_1.nextInt();
        int z = x + y;
        System.out.println(z);
        // input your solution here */
    }

    //todo Task 5
    public void swapTwoNumbers()
    {
        int x, y;
        System.out.println("Before Swap:");
        System.out.print("x: ");
        Scanner Task5 = new Scanner(System.in);
        x = Task5.nextInt();
        System.out.print("y: ");
        y = Task5.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers()
    {
        System.out.print("n1: ");
        Scanner Task6_1 = new Scanner(System.in);
        int x6 = Task6_1.nextInt();

        System.out.print("n2: ");

        int y6 = Task6_1.nextInt();

        if(x6 == y6)
        {
            System.out.println("n1 == n2");
        } else if(x6 < y6)
        {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 > n2");
        }
        // input your solution here */
    }

    //todo Task 7
    public void ratingSalesPerson()
    {
        System.out.print("Enter annual Revenue: ");
        Scanner scan = new Scanner(System.in);
        int money;
        money = scan.nextInt();

        if(money<0||money>=100000)
        {
            System.out.println("Invalid Revenue");
        } else if (0 <= money && money < 20000)
        {
            System.out.println("Poor Sales Revenue");
        }else if (20000 <= money && money < 50000)
        {
            System.out.println("Avarage Sales Revenue");
        }else if (50000 <= money && money < 80000)
        {
            System.out.println("Good Sales Revenue");
        }else
        {
            System.out.println("Excellent Sales Revenue");
        }

        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate()
    {
        System.out.print("Enter CommissionClass: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
        // input your solution here
    }

    //todo Task 9
    public void leapyear()
    {
        System.out.print("Year: ");
        Scanner scan = new Scanner(System.in);
        int year;
        year = scan.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println("Leapyear");
        }else
        {
            System.out.println("Not a Leapyear");
        }
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers()
    {
        System.out.print("Number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int x, y, z;

        x = num%10;
        y = num/10%10;
        z = num/100%10;

        num = x*100+y*10+z;

        System.out.println(num);

        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}