import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nexto_3 {
    public static void main(String[] args) {
        String s1 = "cfaree prize worth caremillions";
        String[] spamWords = new String[]{"free", "millions"};

        int result = 0;
        for (String spamWord : spamWords) {
            if (s1.contains(spamWord)) {
                result++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        System.out.println(result);
    }

    public static List<String> getSpamEmails(List<String> subjects, List<String> spam_words) {
        // Write your code here
        List<String> answer = new ArrayList<>();

        spam_words.replaceAll(String::toLowerCase);

        for (String subject : subjects) {
            subject = subject.toLowerCase();
            List<String> subjectWords = Arrays.asList(subject.split(" "));
            int state = 0;

            for (String subjectWord : subjectWords) {
                if (spam_words.contains(subjectWord)) {
                    state++;
                }

                if (state >= 2) {
                    break;
                }
            }

            if (state >= 2) {
                answer.add("spam");
            }
            else {
                answer.add("not_spam");
            }
        }

        return answer;
    }
}
