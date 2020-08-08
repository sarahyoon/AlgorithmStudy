package TOSS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class PROB_6 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] inputArr = input.split(";");
        int axisLength = inputArr[0].split(" ").length;
        String[][] tables = new String[inputArr.length][axisLength];
        for(int i = 0;i<inputArr.length;i++){
            for(int j = 0;j<axisLength;j++){
                tables[i][j] = inputArr[i].split(" ")[j];
            }
        }

        int countOnes = 0;
        int countSides = 0;
        for(int i=0;i<tables.length;i++){
            for(int j = 0;j<tables[0].length;j++){

                if("1".equals(tables[i][j])){
                    countOnes++;
                    if("1".equals(tables[i+1][j]) && i<tables.length){
                        countSides++;
                    }
                    if ("1".equals(tables[i][j + 1]) && j < tables[0].length) {
                        countSides++;
                    }
                }
            }
        }
        System.out.println(countOnes*4 - countSides*2);
    }
}
