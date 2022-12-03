package daily;

public class SpiralTraversal {
    public String spiralTraversal(Character[][] matrix) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int row = matrix.length;
        int cal = matrix[0].length;

        int x =0;
        int y =0;
        //boolean[][] isVisited = new boolean[row][cal];
        StringBuilder answer = new StringBuilder();
        answer.append(matrix[0][0]);
        int cnt =0;

        int direction =0;
        //처음 시작
        matrix[0][0] = null;
        cnt++;

        while(cnt< row * cal ){
            //몫 나눈 나머지

            if(x == cal || y ==row){
                x-= dx[direction];
                y-= dy[direction];
                direction++;

            }

            x += dx[(direction+1)%4];
            y += dy[(direction+1)%4];

            while(x >= 0&& x < cal && y >=0 && y < row && matrix[x][y] != null ){

                cnt++;
                matrix[x][y] = null;
                answer.append(matrix[x][y]);

            }

        }

        return answer.toString();

    }
}
