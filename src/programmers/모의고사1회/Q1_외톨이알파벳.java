package programmers.모의고사1회;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//모의고사 1회 1번문제 '외톨이 알파벳'
public class Q1_외톨이알파벳 {

    public static void main(String[] args) throws Exception {
        solution("eebbaa");
        String a = "hello";
        String b = "@@@";

        System.out.println(a+b);

    }

    public static String solution(String input_string) {//해시 맵을 이용, 문자 별로 나타나는 인덱스 자리를 리스트로 저장한다 예) z : [0,2,4] b: [1,3]

        ArrayList<Character> arr = new ArrayList<>();
        int len = input_string.length(); 
        Map<Character, List<Integer>> charlists = new HashMap<Character, List<Integer>>();
        Character key = null;
        
        for(int i =0;i<len; i++){

            key = input_string.charAt(i);

            if (!charlists.containsKey(key)) {
                charlists.put(key, new ArrayList<>());
                charlists.get(key).add(i);
            }else{
                charlists.get(key).add(i);
            }
        }


        for (Map.Entry<Character, List<Integer>> entry : charlists.entrySet()) {
            List<Integer> indices = entry.getValue();
            if (indices.size() >= 2 && !ifSerialNum(indices)) {//문자열에서 해당 문자가 등장한 횟 수가 2회를 넘고 연속 된 숫자가 아니면 arrlist에 저장한다. 즉, 외톨이 알파벳
                arr.add(entry.getKey());
            }
        }
        
        if (arr.isEmpty()) { 
            return "N";
        }

        Collections.sort(arr);//리스트를 오름차순으로 정렬
        StringBuilder answer = new StringBuilder();
        for (char c : arr) {
            answer.append(c);
        }
        return answer.toString();
        
    }


    public static boolean ifSerialNum (List<Integer> numbers){//리스트에 저장된 숫자들이 연속된 숫자인지 아닌지 판별

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) - numbers.get(i - 1) != 1) {
                return false;
            }
        }

        return true;
    }
    

}