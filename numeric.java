package patternProgram;
 import java.util.Scanner;
public class numeric
{ public static void main(String[] args) 
    { Scanner s= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=s.nextInt(); 
         int count =0;
         for(int i =1 ;i <= num ; i++)
         { 
            for(int j = 1; j <= i; j++)
             {
                count=count+1;
                 System.out.print(count+ " "); 
            }
             System.out.println(""); 
        }
         s.close();
    }
}
