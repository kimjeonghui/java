package Section2.Solution;

import java.util.LinkedList;
import java.util.Queue;

public class DFS_BFS12 {
    public int connectedVertices(int[][] edges) {
        int cnt =0;//카운트 하는 변수

        //스택으로 구현하면 재귀함수를 사용해야 해서 비효율적, 깊이
        //큐로 구현 너비
        //poll해서 비어있으면 cnt++


        //인접행렬을 만들어야 함
        int max=0;
        for(int i=0; i<edges.length; i++){
            for(int j=0; j<2; j++){
                if(max< edges[i][j]) max =  edges[i][j];
            }
        }
        int[][] matrix = new int[max+1][max+1];

        for(int i=0; i<matrix.length; i++){ //행렬 초기화
            for(int j=0; j< matrix.length; j++){
                matrix[i][j]= 0;
            }
        }

        //데이터 넣어주기
        for(int i=0; i<edges.length; i++){
            int from = edges[i][0];
            int to = edges[i][1];
            matrix[from][to] = 1;
            matrix[to][from] = 1;
        }


        boolean[] visited = new boolean[matrix.length]; // 방문여부
        for(int i =0; i<visited.length; i++){ //배열 초기화
            visited[i] = false;
        }

        //edges로 연결된 곳만 체크하면 왜 안돼지???


        for(int i =0; i<matrix.length; i++){ //matrix의 모든 행 검사
            if(visited[i] == false){
                cnt++;
                visited[i] = true;
                visited = bfs(matrix, i, visited);
            }
        }
        return cnt;



    }

    public boolean[] bfs(int[][] matrix, int vertex, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int j =0; j<matrix.length; j++){
                if(matrix[current][j]== 1 && visited[j]== false){
                    queue.add(j);
                    visited[j]= true;
                }
            }

        }

        return visited;
    }
}
