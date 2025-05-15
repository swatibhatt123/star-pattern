
package patternProgram;
 import java.util.Scanner;
public class reverseStar 
{ public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=sc.nextInt(); 
         for(int i =1 ;i <= num ; i++)
         { 
            for(int s =num-1; s>=i; s--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
             {
                 System.out.print("*"); 
            }
             System.out.println(""); 
        }
         sc.close();
    }
}