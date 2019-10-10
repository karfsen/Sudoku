public class Sudoku {
    public int[][] gameplan;

    public Sudoku(int[][] gameplan) {
        this.gameplan = gameplan;
    }


    public boolean rowCheck(int row,int num){
        for(int i=0;i<9;i++){
            if(gameplan[row][i]==num){
                return true;
            }
        }
        return false;
    }
    public boolean colCheck(int col,int num){
        for(int i=0;i<9;i++){
            if(gameplan[i][col]==num){
                return true;
            }
        }
        return false;
    }

    public boolean boxCheck(int col,int row,int num){
        for(int i=row%3;i<row%3+3;i++){
            for(int j=col%3;j<col%3;j++){
                if(gameplan[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }




    public void writeMatrix(int[][] gameplan) {
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0)
                System.out.println(" -----------------------");
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print(gameplan[i][j] == 0 ? " " : Integer.toString(gameplan[i][j]));

                System.out.print(' ');
            }
            System.out.println("|");
        }
        System.out.println(" -----------------------");
    }



}
