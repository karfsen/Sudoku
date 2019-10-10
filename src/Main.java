public class Main {
    public static void main(String[] args) {
        int[][] pole={
                {0,0,4,6,0,0,0,0,5},
                {7,0,1,0,0,0,0,0,0},
                {9,6,0,0,8,7,0,0,0},
                {6,8,0,0,5,0,0,3,0},
                {0,0,0,0,0,0,0,0,0},
                {0,3,0,0,9,0,0,6,7},
                {0,0,0,7,4,0,0,1,6},
                {0,0,0,0,0,0,2,0,8},
                {3,0,0,0,0,1,9,0,0}
        };
        Sudoku sudoku=new Sudoku(pole);
        sudoku.writeMatrix(sudoku.SolveMatrix());
    }
}
