package programmers.모의고사1회;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//모의고사 1회 1번문제 '외톨이 알파벳'
public class number1 {

    public static void main(String[] args) throws Exception {
        solution("dlkfjasdfj");

    }

    public static String solution(String input_string) {

        int len = input_string.length();
        Map<Character, List<Integer>> charlists = new HashMap<Character, List<Integer>>();

        for(int i =0;i<len; i++){
            Character key = input_string.charAt(i);
            if (!charlists.containsKey(key)) {
                charlists.put(key, new ArrayList<>());
                charlists.get(key).add(i);
            }else{
                charlists.get(key).add(i);
            }
        }


        for (Map.Entry<Character, List<Integer>> entry : charlists.entrySet()) {

            List<Integer> li = new ArrayList<>();
            li = entry.getValue();
            int li_size = entry.getValue().size();

            if (li_size >= 2) {
                
            }
        }



        String answer = input_string;
        System.out.println(answer);
        return answer;
    }


    
    

}
