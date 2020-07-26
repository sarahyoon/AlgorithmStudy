package DataStructure;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Prob_17413 {

    static void print(Stack stack, StringBuilder stringBuilder){
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
    }

    static void usingBooleanFalgs() throws IOException{
        Stack<Character> stack = new Stack<>();

        boolean tag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray()){

            if(c == '<'){
                print(stack, sb);
                tag = true;

            }
            else if(c == '>'){
                tag=false;
                sb.append(c);
            }
            else if(tag){
                sb.append(c);
            }
            else{
                if(c == ' '){
                    print(stack, sb);
                    sb.append(c);
                }
                else{
                    stack.push(c);
                }
            }
        }
        print(stack, sb);

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    static void usingWhileLoop(String s){

        StringBuilder sb = new StringBuilder();
        int index = 0;
        Stack<Character> stack = new Stack<>();

        while(index < s.length()){

            if('<' == s.charAt(index)){
                if(!stack.isEmpty()){
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
                while(s.charAt(index) != '>'){
                    sb.append(s.charAt(index));
                    index++;
                }
                sb.append(s.charAt(index));
                index++;
            }
            else{
                if(s.charAt(index) == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(s.charAt(index));
                    index++;
                }
                else {
                    stack.push(s.charAt(index));
                    index++;
                }
            }
        }
        //check last word
        if(!stack.isEmpty()){
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {

        String s = "<open>tag<close>";
        usingBooleanFalgs();
        usingWhileLoop(s);


    }
}
