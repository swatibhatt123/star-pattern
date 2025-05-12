package patternProgram;
 import java.util.Scanner;
public class rotateStarPattern 
{ 
    public static void main(String[] args) 
    { 
        Scanner s= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=s.nextInt(); 
         for(int i =1 ;i <= num ; i++)
         { 
            for(int j = num; j >= i; j--)
             {
                 System.out.print("*"); 
            }
             System.out.println(""); 
        }
         s.close();
    }
}