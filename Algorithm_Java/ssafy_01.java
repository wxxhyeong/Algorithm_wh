import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ssafy_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> arr = new LinkedList<>();


        for (int t = 0; t < test; t++) {
            int n = Integer.parseInt(br.readLine());
            LinkedList<Integer> prices = new LinkedList<>();
            StringTokenizer stk = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                prices.add(Integer.parseInt(stk.nextToken()));
            }

            int answer = solution(prices);
            sb.append("#"+(t+1) +" "+ answer + "\n");
        }

        System.out.println(sb.toString());

    }

    public static int solution(LinkedList<Integer> prices) {
        int result = 0;
        Collections.sort(prices);

        for (Integer price : prices) {
            System.out.print(price +" ");
        }
        System.out.println();

        while (!prices.isEmpty()) {
            int buy = prices.getLast();
            prices.removeLast();

            for (int i = prices.size()-1; i >= 0; i--) {
                if (buy > prices.get(i)) {
                    prices.remove(i);
                    break;
                }
            }
            System.out.println("buy = " + buy);
            result += buy;

        }
        return result;
    }
}
