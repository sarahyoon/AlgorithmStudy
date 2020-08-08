package TOSS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB_7 {

    //4; 1 30 0 6 0 2 1 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] inputA = input.split(" ");
        String[] pointerArr = inputA[0].split(";");
        String pointerS = pointerArr[0];

        String[] inputB = new String[inputA.length];
        int pointer = Integer.parseInt(pointerS);
        inputB[0] = "0;";
        int index = 1;
        recursion(inputA, inputB, pointer+1, index);
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<inputB.length;i++){
           if(inputB[i] == null){
               inputB[i] = "0";
           }
           sb.append(inputB[i] + " ");
       }
        System.out.println(sb.toString());
    }
    static String[] recursion(String[] a, String[] b, int pointer, int index){

        if("0".equals(a[pointer])){
            b[index] = a[pointer];
            index++;
            b[index] = index+"";
            index++;
            pointer = Integer.parseInt(a[pointer+1]);
            recursion(a, b, pointer+1, index);
        }

        if("1".equals(a[pointer])){
            b[index++] = a[pointer];
            b[index++] = a[pointer+1];
            return b;
        }
        return b;
    }
}
