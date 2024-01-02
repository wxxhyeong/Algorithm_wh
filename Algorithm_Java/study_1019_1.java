import java.util.ArrayList;
import java.util.HashMap;

// 프로그래머스 오픈채팅방
public class study_1019_1 {

    public static void main(String[] args) {
        solution(new String[]
                {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});

    }

    static public String[] solution(String[] record) {

        HashMap<String, String> userId = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        //enter와 change일때 userId 값 변경하기
        for (String r : record) {
            String[] rec = r.split(" ");
            if (rec[0].equals("Enter") || rec[0].equals("Change")) {
                userId.put(rec[1], rec[2]);
            }
        }

        for (String r : record) {
            String[] rec = r.split(" ");

            switch (rec[0]) {
                case "Enter" :
                    result.add(userId.get(rec[1]) + "님이 들어왔습니다.");
                    //System.out.println(userId.get(rec[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave" :
                    result.add(userId.get(rec[1]) + "님이 나갔습니다.");
                    //System.out.println(userId.get(rec[1]) + "님이 나갔습니다.");
                    break;
            }
        }

        String[] answer = result.toArray(new String[result.size()]);

        return answer;
    }
}
