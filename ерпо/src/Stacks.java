import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        Stack<Integer> s1 = new  Stack<Integer>();
        Stack<Integer> s2 = new  Stack<Integer>();
        Stack<Integer> s3 = new  Stack<Integer>();
        int h1 = 0;
        int h2 = 0;
        int h3 = 0;




        for(int i = 0; i < n1; i++){
            int cylinder = in.nextInt();
            s1.add(cylinder);
            h1 += cylinder;
        }

        for(int i = 0; i < n2; i++){
            int cylinder = in.nextInt();
            s2.add(cylinder);
            h2 += cylinder;
        }

        for(int i = 0; i < n3; i++){
            int cylinder = in.nextInt();
            s3.add(cylinder);
            h3 += cylinder;
        }


        while(h1 != h2 || h1 != h3)
        {
         if (h1>h2&&h1>h3){
          h1 -= s1.pop();
             }
           else if (h2>h1&&h2>h3){
                h2 -= s2.pop();
                }
               else{
                 h3 -= s3.pop();
                   }
        }

        System.out.println(h1);
    }
}







