import java.util.ArrayDeque;
import java.util.Deque;

public class leet424 {

    public int characterReplacement(String s, int k) {

        Deque<Character> deque = new ArrayDeque<>();
        int size = 0;

        for (int i = 0; i < s.length(); i++) {

            if (deque.isEmpty()) {
                deque.add(s.charAt(i));
            }
            else {

            }


        }
    return 0;
    }
}
