import java.io.*;
import java.util.*;

public class boj16508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();

        int n = Integer.parseInt(br.readLine());
        int[] price = new int[n];
        int minPrice = 100000;
        ArrayList<char[]> bookSpell = new ArrayList<>();
        ArrayList<int[]> bookIndex = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            price[i] = Integer.parseInt(stk.nextToken());
            bookSpell.add(stk.nextToken().toCharArray());
        }


        //spell = a~z 개수 담는 배열, 각 책마다 알파벳 수를 저장
        for (char[] book : bookSpell) {
            int[] spell = new int[26];
            for (char c : book) {
                spell[c - 97] += 1;
            }
            bookIndex.add(spell);
        }

        //반복문으로 안에 배열 전부 탐색 후, 탐색 마친 뒤 결과 표시
        for (int i = 0; i < n; i++) {
            dfs();
        }


    }

    static void dfs() {

    }
}
