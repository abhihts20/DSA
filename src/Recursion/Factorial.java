package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    static int num;
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number");
        num=getInt();
        System.out.println("Factorial "+factorial(num));

    }
    public static int factorial(int n){
        if (n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }
    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }
}
