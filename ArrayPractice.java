class Main {
    public static void main(String[] args) {
        // System.out.println("Welcome to Array Practice!");
        // createArray(5);
        // create2DArray(4, 5);
        create3DArray(4, 4, 4);
    }

    public static void createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }

    public static void create2DArray(int rows, int cols) {
        int[][] array = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                array[row][col] = (int) (Math.random() * 10);
            }
        }

        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    public static void create3DArray(int x, int y, int z) {
        int[][][] array = new int[x][y][z];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }

        for (int[][] top : array) {
            for (int[] row : top) {
                for (int colVal : row) {
                    System.out.print(colVal + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}