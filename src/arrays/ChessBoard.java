package arrays;

public class ChessBoard {

    public static char[][] board;

    public static void main(String[] args) {

        setBoard('T', 'O');
        System.out.println(boardToString());

    }

    public static char[][] getBoard() {
        return board;
    }

    public static void setBoard(char black, char white) {
        board = new char[8][8];
        fillBoard(black, white);
    }

    public static void fillBoard(char black, char white) {
        for (int i = 0; i < board.length; i++) {
            boolean rowValue = (i % 2 == 0);
            for (int j = 0; j < board[i].length; j++) {
                boolean colValue = (j % 2 == 0);
                board[i][j] = (colValue == rowValue ? black : white);
                // simplify: board[i][j] = (i % 2 == j % 2 ? black : white);
            }
        }
    }

    public static String boardToString() {
        if (board != null) {
            StringBuilder b = new StringBuilder();

            for (char[] arr : board) {
                for (char c : arr) {
                    b.append(c).append(" ");
                }
                b.setLength(b.length() - 1);
                b.append("\n");
            }

            b.setLength(b.length() - 1);

            return b.toString();
        }
        return "";
    }

}
