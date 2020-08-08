package TOSS;
import java.io.*;

public class PROB_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Boolean isAnswer = true;


        if(input.charAt(input.length() -1) == '1'){
            isAnswer = false;
        }

        for(int i=0;i<input.length()-1 ; i++){
            if(input.charAt(i) == '1' && input.charAt(i+1) != '2'){
                isAnswer = false;
            }
        }
        System.out.println(isAnswer);
    }
}
