package patternProgram;
 import java.util.Scanner;
public class vPattern 
{ 
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=sc.nextInt(); 
         for(int i =1 ;i <= num ; i++)
         { 
            for(int s =num; s>=i; s--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <(i*2) ; j++)
             { 
                if(j>1 && j <(i*2)-1)
                {
                System.out.print(" "); 
                }
             else{
               System.out.print("*");  
             }
                 
            }
             System.out.println(""); 
        }
         sc.close();
    }
}
