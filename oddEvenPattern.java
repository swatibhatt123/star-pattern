package patternProgram;
 import java.util.Scanner;
public class oddEvenPattern
{ public static void main(String[] args) 
    { Scanner s= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=s.nextInt();
         int count = 0; 
         for(int i =1 ;i <= num ; i++)
         { 
            if(i%2!=0){
                for(int j = 1; j <= 3; j++)
                {
                    count=count +1;
                    System.out.print(count + " ");
                }
            }
            else
            {
                int temp=count +1;
                for(int j = count + 3; j >= temp; j--){
                    count=count +1;
                    System.out.print(j+ " "); 
                }
            }
            
             System.out.println(""); 
        }
         s.close();
    }
}
