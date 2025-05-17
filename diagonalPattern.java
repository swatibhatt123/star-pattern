package patternProgram;
 import java.util.Scanner;
public class diagonalPattern 
{ 
    public static void main(String[] args) 
    { 
        Scanner s= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=s.nextInt(); 
         for(int i =1 ;i <= num ; i++)
         { 
            for(int j = 1; j <= i; j++)
             {
                if(i>=2 && j <= i-1){
                  System.out.print(" ");  
                }

                else{
                  System.out.print("*"); 
                }
                 
            }
             System.out.println(""); 
        }
         s.close();
    }
}
