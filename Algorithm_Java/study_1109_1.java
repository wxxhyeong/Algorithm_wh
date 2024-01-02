//백준 5430번 : AC
import java.sql.Array;
import java.util.*;
import java.io.*;
public class study_1109_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());


        for (int t = 0; t < test; t++) {
            boolean isEmpty = false;
            boolean dir = true; //안뒤집어진 상태


            char[] ac = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            String[] inputs = input.substring(1, input.length() - 1).split(",");

            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(inputs[i]));
            }

            for (char c : ac) {
                switch (c) {
                    case 'R':
                        dir = !dir;

                        break;
                    case 'D':
                        if (arr.isEmpty()) {
                            isEmpty = true;
                        }
                        else if (dir) { //true 정방향일때
                            arr.remove(0);
                        }
                        else
                            arr.remove(arr.size()-1);
                }
            }

            if (!isEmpty) {
                if (!dir) {
                    Collections.reverse(arr);
                }
                //sb.append("test =" + (t+1) +"\t");
                sb.append("[");
                if (!arr.isEmpty()) {
                    for (int i = 0; i < arr.size() - 1; i++) {
                        sb.append(arr.get(i)).append(",");
                    }
                    sb.append(arr.get(arr.size() - 1));
                }
                sb.append("]\n");
            }
            else
                sb.append("error\n");

        }

        System.out.println(sb.toString());
    }
}
