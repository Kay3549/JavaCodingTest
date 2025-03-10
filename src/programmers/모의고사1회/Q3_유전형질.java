package programmers.모의고사1회;

public class Q3_유전형질 {


    public static void main(String[] args) {  

        int [][] arr1 = {{3,5}};
        int [][] arr2 = {{3,8},{2,2}};
        solution(arr2);
    }
    

    public static String[] solution(int[][] queries) {  

        int rep = queries.length; // 전체 반복 횟수. 2번
        for(int i = 0; i<rep; i++){
            int generation = queries[i][0]; //3세대, 2세대
            asdf(generation);

        }


        
        String[] answer = {};
        return answer;
    }
    

    public static long asdf (int n){

        long k = (long)Math.pow(4, n - 1);
        System.out.println(k);
        return k;
    }

}
