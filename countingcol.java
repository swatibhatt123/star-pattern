package patternProgram;
 import java.util.Scanner;
public class countingcol
{ public static void main(String[] args) 
    { Scanner s= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=s.nextInt(); 
         for(int i =1 ;i <= num ; i++)
         { 
            int no=i;
            for(int j = 1; j <= i; j++)
             {
                 System.out.print(no + " "); 
                 no=no+num-j;
            }
             System.out.println(""); 
        }
         s.close();
    }
}
