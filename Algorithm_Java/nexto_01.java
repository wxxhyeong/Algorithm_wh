import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nexto_01 {

    public static void main(String[] args) {
        System.out.println(findMaxDistinctItems(5, 8, new ArrayList<>()));
    }

    public static int findMaxDistinctItems(int n, int k, List<Integer> arr) {
        // Write your code here
        int money = 0;
        List<Integer> ans = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            temp.add(i);
        }

        for (Integer i : arr) {
            if (i <= n){
                temp.remove(i - 1);
            }
        }

        for (Integer integer : temp) {
            int sum = money + integer;
            if (sum > k) {
                break;
            }
            ans.add(integer);
            money = sum;
        }

        return arr.size() + ans.size();



    }
}
