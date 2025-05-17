package patternProgram;
 import java.util.Scanner;
public class invertV
{ 
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=sc.nextInt(); 
         for(int i =num ;i >=1; i--)
         { 
            for(int j =num; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int s = 1; s <(i*2) ; s++)
             { 
                if(s>1 && s<(i*2)-1)
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
