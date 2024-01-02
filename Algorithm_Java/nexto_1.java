/*
s1 = 'axx#bb#c'
s2 = 'axbd#c#c'

#은 백스페이스
 */

public class nexto_1 {

    public static void main(String[] args) {
        System.out.println(compareStrings("r#a#n#k#", "###"));
    }

    public static int compareStrings(String s1, String s2) {

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '#' && !sb1.isEmpty()){
                sb1.deleteCharAt(sb1.length() - 1);
                continue;
            } else if (s1.charAt(i) == '#') {
                continue;
            }
            sb1.append(s1.charAt(i));
        }

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == '#' && !sb2.isEmpty()){
                sb2.deleteCharAt(sb2.length() - 1);
                continue;
            } else if (s2.charAt(i) == '#') {
                continue;
            }
            sb2.append(s2.charAt(i));
        }
        System.out.println(sb2.toString());

        if (sb1.toString().equals(sb2.toString())) {
            return 1;
        }
        return 0;
    }
}
