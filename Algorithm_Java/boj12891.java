import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj12891 {

    static int acgt[];
    static int myArr[];
    static int checkCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(stk.nextToken());
        int p = Integer.parseInt(stk.nextToken());

        char[] input = br.readLine().toCharArray();
        acgt = new int[4];
        myArr = new int[4];


        checkCnt = 0;
        int result = 0;
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            acgt[i] = Integer.parseInt(stk.nextToken());
            if (acgt[i] == 0) {
                checkCnt += 1;
            }
        }

        for (int i = 0; i < p; i++) {
            add(input[i]);
        }

        if (checkCnt == 4)
            result++;


        for (int i = p; i < s; i++) {
            delete(input[i - p]); //맨앞에 있는 값을 지워줘야함
            add(input[i]);

            if (checkCnt == 4) {
                result++;
            }
        }

        System.out.println(result);

    }

    public static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0] += 1;
                if (myArr[0] == acgt[0])
                    checkCnt += 1;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == acgt[1])
                    checkCnt++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == acgt[2])
                    checkCnt++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == acgt[3])
                    checkCnt++;
                break;
        }
    }

    public static void delete(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == acgt[0])
                    checkCnt -= 1;
                myArr[0] -= 1;

                break;
            case 'C':
                if (myArr[1] == acgt[1])
                    checkCnt--;
                myArr[1]--;

                break;
            case 'G':
                if (myArr[2] == acgt[2])
                    checkCnt--;
                myArr[2]--;

                break;
            case 'T':
                if (myArr[3] == acgt[3])
                    checkCnt--;
                myArr[3]--;

        }
    }

}
