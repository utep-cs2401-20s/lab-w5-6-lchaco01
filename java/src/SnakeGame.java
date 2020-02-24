public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public SnakeGame() {
        game = new boolean [1][1];
    }

    public SnakeGame(boolean[][] g, int x, int y) {
        headPosition = new int [2];
        headPosition[0] = x;
        headPosition[1] = y;
        game = g;
    }

    public int[] findTailExhaustive(int x, int y) {
        int cells = 0;
        int length = 0;
        int neigh = 0;
        int[] result = new int [3];
        for (int r = 0; r < game.length; r++) {
            for (int c = 0; c < game[r].length; c++) {
                int count;
                if (game[r][c]) {
                    if (r + 1 < game.length  && c + 1 < game[r].length) {
                        if (game[r + 1][c] == true) {
                            neigh++;
                        }
                        if (game[r][c + 1] == true) {
                            neigh++;
                        }
                    }
                    if (r - 1 >= 0 && c - 1 >= 0) {
                        if (game[r - 1][c] == true) {
                            neigh++;
                        }
                        if (game[r][c - 1] == true) {
                            neigh++;
                        }
                    }
                }

                cells++;
            }
        }
        //length++;
        return result;
    }

    public int[] findTailRecursive(int x, int y) {
        int cells = 0;
        int length = 0;
        int[] result = new int [3];

        return result;
    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition) {

    }

    private void resetChecks() {

    }
}