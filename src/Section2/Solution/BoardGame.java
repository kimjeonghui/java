package Section2.Solution;

public class BoardGame {
    public Integer boardGame(int[][] board, String operation) {
        // current[]
        //상하좌우 (-1,0) (1,0), (0,-1), (0,1) 이차원배열
        int score =0 ;
        int[] current = new int[]{0,0};

        for(int i = 0; i<operation.length(); i++){
            char c = operation.charAt(i);

            switch(c){
                case 'U':
                    if(current[0] == 0) return null;
                    current[0]+= -1;
                    score += board[current[0]][current[1]];
                    break;
                case 'D':
                    if(current[0] == board.length-1) return null;
                    current[0]+= 1;
                    score += board[current[0]][current[1]];
                    break;
                case 'R':
                    if(current[1] == board.length-1) return null;
                    current[1]+= 1;
                    score += board[current[0]][current[1]];
                    break;

                case 'L':
                    if(current[1] == 0) return null;
                    current[1]+= -1;
                    score += board[current[0]][current[1]];
                    break;
            }
        }
        return score;

    }
}
