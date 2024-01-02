//import java.util.TreeMap;
//
//public class study_1012_3 {
//
//
//    class Solution {
//        public int solution(String numbers) {
//            int n = 10000000;
//
//            Boolean[] isPrime = new Boolean[n]; //소수 리스트 생성
//            for (int i = 2; i * i <= n; i++) {
//                if (!isPrime[i]) {
//                    for (int j = i*i; j<n; j += i) {
//                        isPrime[j] = true;
//                    }
//                }
//            }
//
//            char[] nums = numbers.toCharArray();
//
//            Boolean[]
//            //아래 dfs or bfs 해서 소수리스트에 있는지 확인하여 개수 구하기
//            for (char num : nums) {
//
//            }
//
//
//            int answer = 0;
//            return answer;
//        }
//    }
//}
