public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public SnakeGame() {
        game = new boolean [1][1];
    }

    public SnakeGame(boolean[][] g) {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; i < game[i].length; j++) {
                g[i][j] = game[i][j];
            }
        }
    }
}
