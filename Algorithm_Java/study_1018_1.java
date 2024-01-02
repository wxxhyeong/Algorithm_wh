public class study_1018_1 {

    public int solution(String skill, String[] skill_trees) {

        char[] skillChar = skill.toCharArray();
        for (String skill_tree : skill_trees) {
            char[] skillTree = skill_tree.toCharArray();

            int temp = -1;
            boolean turnOX;
            for (char c : skillChar) {
                for (int i = 0; i < skillTree.length; i++) {
                    if (skillTree[i] == c && i >temp) {
                        temp = i;
                        continue;
                    }
                }
            }
        }


        int answer = -1;
        return answer;
    }
}
