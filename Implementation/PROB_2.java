package TOSS;
import java.io.*;

public class PROB_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        boolean isAscending = true;
        String[] nums = input.split(" ");
        if(nums.length == 6){
            for(int i=0;i<nums.length-1;i++){
                int number1 = Integer.parseInt(nums[i]);
                int number2 = Integer.parseInt(nums[i+1]);

                if((number1<0 || number1>45) || (number2<0 || number2>45)){
                    isAscending = false;
                    break;
                }
                if(number1>number2){
                    isAscending = false;
                    break;
                }
            }
        }
        else{
            isAscending = false;
        }

        System.out.println(isAscending);


    }
}
