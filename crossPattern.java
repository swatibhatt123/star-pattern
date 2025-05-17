package patternProgram;
 import java.util.Scanner;
public class crossPattern 
{ 
    public static void main(String[] args) 
    { 
        Scanner s= new Scanner(System.in); 
        System.out.println("enter the no.of rows");
         int num=s.nextInt(); 
         for(int i =0 ;i < num ; i++)
         { 
            for(int j = 0; j < num; j++)
             {
                if(i==j  || i+j == 5-1){
                  System.out.print("*");  
                }

                else{
                  System.out.print(" "); 
                }
                 
            }
             System.out.println(""); 
        }
         s.close();
    }
}

