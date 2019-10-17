public class Main {
    public static void main(String[] args) {
        int[][] pole={
                {1,0,0,0,2,6,0,3,9},
                {0,0,8,7,0,0,6,0,1},
                {0,0,0,0,0,0,2,0,0},
                {4,0,0,9,0,0,5,1,6},
                {0,0,0,0,0,0,0,0,0},
                {7,9,6,0,0,4,0,0,8},
                {0,0,9,0,0,0,0,0,0},
                {3,0,1,0,0,2,9,0,0},
                {6,4,0,1,8,0,0,0,3}
        };
        Sudoku sudoku=new Sudoku(pole);
        sudoku.solverino();
        System.out.println("FINALNA VERZIA");
        sudoku.writeMatrix();
    }
}
