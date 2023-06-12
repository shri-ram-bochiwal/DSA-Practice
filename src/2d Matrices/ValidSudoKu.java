/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */

import java.util.*;

public class ValidSudoKu {

    public boolean isValidSudoku(char[][] board){
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] != '.'){
                    String b = "("+board[i][j]+")";
                    if(!hs.add(b+i) || !hs.add(j+b) || !hs.add(i/3 + b + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        char[][] input1 = {{'5','3','.','.','7','.','.','.','.'}
                          ,{'6','.','.','1','9','5','.','.','.'}
                          ,{'.','9','8','.','.','.','.','6','.'}
                          ,{'8','.','.','.','6','.','.','.','3'}
                          ,{'4','.','.','8','.','3','.','.','1'}
                          ,{'7','.','.','.','2','.','.','.','6'}
                          ,{'.','6','.','.','.','.','2','8','.'}
                          ,{'.','.','.','4','1','9','.','.','5'}
                          ,{'.','.','.','.','8','.','.','7','9'}};
        char input2[][] = {{'8','3','.','.','7','.','.','.','.'}
                          ,{'6','.','.','1','9','5','.','.','.'}
                          ,{'.','9','8','.','.','.','.','6','.'}
                          ,{'8','.','.','.','6','.','.','.','3'}
                          ,{'4','.','.','8','.','3','.','.','1'}
                          ,{'7','.','.','.','2','.','.','.','6'}
                          ,{'.','6','.','.','.','.','2','8','.'}
                          ,{'.','.','.','4','1','9','.','.','5'}
                          ,{'.','.','.','.','8','.','.','7','9'}};
        ValidSudoKu sudoku = new ValidSudoKu();
        System.out.println("Result For Input1 : " + sudoku.isValidSudoku(input1));
        System.out.println("Result For Input2 : " + sudoku.isValidSudoku(input2));
    }

}
