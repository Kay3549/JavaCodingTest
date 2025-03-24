package programmers.모의고사1회;

public class Q3_유전형질 {
    public static void main(String[] args) {
        int[][] arr2 = { { 3, 5 }, { 2, 2 } };
        String[] result = solution(arr2);

        for (String s : result) {
            System.out.println(s); // 결과 출력
        }
    }

    public static String[] solution(int[][] queries) {  
        int rep = queries.length;  
        String[] answer = new String[rep]; // 배열 초기화

        for (int i = 0; i < rep; i++) {  
            int generation = queries[i][0];  
            int order = queries[i][1] - 1; // index 0번 부터 시작하는 걸로 변경

            answer[i] = find(generation, order); // 재귀
        }

        return answer;  
    }

    private static String find(int n, int p) {
        if (n == 1) return "Rr"; // 기본 케이스, 루트

        int slice = (int) Math.pow(4, n - 2);  
        int group = p / slice; //어느 그룹에 속하는지 결정

        if (group == 0) return "RR";  
        if (group == 3) return "rr";  

        return find(n - 1, p % slice); // 재귀
    }
}
