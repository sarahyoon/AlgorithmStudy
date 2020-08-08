package TOSS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PROB_4 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] bank = input.split(" ");
        String[] usedBank = new String[bank.length];

        for(int i=0;i<bank.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j =0 ;j<=i;j++){
                sb.append(bank[j] + " ");
            }
            usedBank[i] = sb.toString();
        }

        for(int i=0;i<usedBank.length;i++){
            String[] recentBanks = usedBank[i].split(" ");
            Map<String, Integer> map = new HashMap<>();
            int index = 0;
            int count =1;

            //remove duplicate banks && get recent 5
            for(int j=recentBanks.length-1;j>=0;j--){
                if(count>5){
                    break;
                }
                if(!map.containsKey(recentBanks[j])){
                    map.put(recentBanks[j], index++);
                    count++;
                }
            }

            //map ascending order by value
            List<String> keySetList = new ArrayList<>(map.keySet());
            Collections.sort(keySetList, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
            System.out.println(keySetList);
        }
    }
}
