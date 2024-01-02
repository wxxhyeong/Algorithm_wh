//// 프로그래머스 : [3차] 압축 level 2
//
//import java.util.*;
//
//public class study_2 {
//
//
//    public int[] solution(String msg) {
//
//        char[] message = msg.toCharArray();
//        HashMap<String, Integer> words = new HashMap<>();
//        int lastNum = 26;
//        int[] answer = {};
//
//        List<Integer> result = new ArrayList<>();
//
//        for (char c = 'A'; c <= 'Z'; c++) {
//            words.put(, c - 64);
//        }
//
//        String temp = "";
//        for (char m : message) {
//            temp += m;
//            if (words.containsKey(temp)) {
//                result.add(words.get(temp));
//                continue;
//            }
//
//            words.put(m, ++lastNum);
//            result.add(lastNum);
//
//        }
//
//
//
//        return answer;
//    }
//
//
//}
