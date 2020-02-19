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
        int[] result = new int [3];
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                int count;
                if (game[i][j]) {
                    length++;
                    if () {

                    }
                }
                cells++;
            }
        }
        return result;
    }

    public int[] fineTailRecursive(int x, int y) {
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