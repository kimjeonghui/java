package Section2.Solution;

public class Graph10 {
    public int[][] createMatrix(int[][] edges) {
        //int row=0;
        int col =0;//최대 열
        //양방향이면 최대 행의 수가 다를 수 있음
        for(int i = 0; i<edges.length; i++){
            for(int j=0; j<edges[i].length; j++){
                //if(row< edges[i][0]) row = edges[i][0];
                if(col < edges[i][j]) col = edges[i][j];
            }
        }
        //초기화
        int[][] output = new int[col+1][col+1];
        for(int i=0; i<col+1; i++){
            for(int j=0; j<col+1; j++){
                output[i][j] = 0;
            }
        }

        //데이터 넣기
        output = input(output, edges);

        return output;
    }

    //데이터 넣는 메서드
    public static int[][] input(int[][] output, int[][] edges){
        int[][] result = output;
        for(int i= 0; i<edges.length; i++){
            if(edges[i][2] == 0){ //일시 방향
                int r= edges[i][0];
                int c = edges[i][1];
                result[r][c] = 1;
            }
            else{ //일시 무향
                int r= edges[i][0];
                int c = edges[i][1];
                result[r][c] = 1;
                result[c][r] = 1;
            }
        }

        return result;


    }

}
