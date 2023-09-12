import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        for(int i=0;i=n-1;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                int sum=(Math.pow(2,i))*b;
                System.out.println(5+sum+" ");
            }
        }
        in.close();
    }
}