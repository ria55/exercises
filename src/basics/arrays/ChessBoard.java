package basics.arrays;

public class ChessBoard {

    public static char[][] board;

    public static void main(String[] args) {

        setBoard(8,'.', 'O');
        System.out.println(boardToString());

    }

    public static char[][] getBoard() {
        return board;
    }

    public static void setBoard(int n, char black, char white) {
        board = new char[n][n];
        fillBoard(black, white);
    }

    public static void fillBoard(char black, char white) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (i % 2 == j % 2 ? black : white);
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
