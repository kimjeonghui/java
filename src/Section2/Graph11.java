package Section2;

import java.util.LinkedList;
import java.util.Queue;

public class Graph11 {
    public boolean getDirections(int[][] matrix, int from, int to) {
        Queue<Integer> queue = new LinkedList<>(); //너비 우선 탐색
        boolean[] visited = new boolean[matrix.length];//확인했던 노드인 걸 알기 위한 배열
        //배열초기화
        for(int i=0; i<matrix.length; i++){
            visited[i] = false;
        }

        queue.add(from); //처음 시작점 넣어놓기
        visited[from] = true; //방문 표시

        //from에서 인접 간선들 확인
        //인접 간선들의 간선 확인
        //to가 나오면 true 리턴
        //스택이 비워지면 while문 종료
        //끝까지 확인 했을 때 to가 안나오면 false
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current == to)return true;
            for(int i= 0; i<matrix.length; i++){
                if((matrix[current][i] ==1) && (visited[i]!=true)){//현재 노드와 연결돼있고 방문한 적이 없으면 큐에 넣기
                    queue.add(i);
                }

            }
        }

        return false;


    }
}
