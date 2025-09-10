package Greedy_Algorithm;
import java.util.*;

public class Indian_Coins {
    public static void main() {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countCoins = 0;
        int amount = 794;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<coins.length ; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount){
                    countCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total Minimum Coins Used :" +countCoins);
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
