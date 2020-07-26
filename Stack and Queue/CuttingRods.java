package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class CuttingRods {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i=0;i<s.length() ;i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else{
                //then it's laser
                if( s.charAt(i-1) == '('){
                    stack.pop();
                    count += stack.size();
                }
                else{
                    stack.pop();
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
