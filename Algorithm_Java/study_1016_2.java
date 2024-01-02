// 이중 우선 순위 큐
import java.util.Collections;
import java.util.PriorityQueue;

public class study_1016_2 {

    public static void main(String[] args) {
        solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
    }

    static public int[] solution(String[] operations) {

        PriorityQueue<Integer> pqInc = new PriorityQueue<>();
        PriorityQueue<Integer> pqDec = new PriorityQueue<>(Collections.reverseOrder());

        int[] answer = new int[2];

        for (String operation : operations) {
            if (operation.charAt(0) == 'I') {
                pqInc.add(Integer.parseInt(operation.substring(2)));
                pqDec.add(Integer.parseInt(operation.substring(2)));

            }

            else {
                if (!pqInc.isEmpty()){
                    int temp = 0;
                    if (operation.substring(2).equals("1")) { //최댓값 빼는 경우
                        System.out.println(operation.substring(2));
                        temp = pqInc.poll();
                        System.out.println(temp);
                        for (Integer integer : pqInc) {
                            System.out.printf("%d   ", integer);
                        }
                        System.out.println("________________________");
                        pqDec.remove(temp);
                    }
                    else {
                        System.out.println(operation.substring(2));
                        temp = pqDec.poll(); // 최솟값 빼는 경우
                        pqInc.remove(temp);
                    }
                }
            }

//            for (Integer integer : pqInc) {
//                System.out.printf("%d   ", integer);
//            }
//            System.out.println();
        }

        if (!pqInc.isEmpty()) {
            answer[0] = pqInc.poll();
            if (!pqInc.isEmpty()) {
                answer[1] = pqDec.poll();
            }
        }
        return answer;
    }

}
