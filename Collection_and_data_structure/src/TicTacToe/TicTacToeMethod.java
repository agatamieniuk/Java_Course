package TicTacToe;

public class TicTacToeMethod {
    private String x = "X";
    private String o = "O";
    private String empty = "-";
    String[][] game = new String[3][3];

//    String[i][j] game
//            {"-", "-", "-"},
//            {"-", "-", "-"},
//            {"-", "-", "-"}};

    public void emptyBoard() {
//        String[][] game = new String[3][3];
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game.length; j++) {
                game[i][j] = empty;
                System.out.print(game[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void moveX(int a, int b) {

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game.length; j++) {
                game[i][j] = empty;
                System.out.print(game[i][j]);
            }
            System.out.println(" ");
        }
        game[a][b] = getO();
//            System.out.println(" ");
    }
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }
}
