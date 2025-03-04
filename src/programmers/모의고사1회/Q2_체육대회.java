package programmers.모의고사1회;

import java.util.ArrayList;
import java.util.Collections;

public class Q2_체육대회 {

    public static void main(String[] args) throws Exception {

        int [][] arr = new int [5][3];

        arr[0] = new int []{40,10,10};
        arr[1] = new int []{20,5,0};
        arr[2] = new int []{30,30,30};
        arr[3] = new int []{70,0,70};
        arr[4] = new int []{100,100,100};

        solution(arr);


    }


    public static int solution(int[][] ability) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i<ability.length; i++){
            arr.add(maxAbility(ability[i]));
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        int sum = 0;
        for(int i=0; i<ability[0].length;i++){
            sum += arr.get(i);
        }

        int answer = sum;
        System.out.println(answer);
        return answer;
        
    }


    public static int maxAbility(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max<i){ max = i; } 
        }
        return max;
    }

}
