/*
 * Implements a 2-D array of characters
 */

public class CharMatrix {
    // Fields:
    char[][] m; // this is the grid

    /*
     * Constructor: creates a grid with dimensions rows, cols,
     * and fills it with spaces
     */
    public CharMatrix(int rows, int cols) {
        m = new char[rows][cols];
        fillRect(0, 0, rows - 1, cols - 1, ' ');
    }

    /*
     * Constructor: creates a grid with dimensions rows , cols ,
     * and fills it with the fill character
     */
    public CharMatrix(int rows, int cols, char fill) {
        m = new char[rows][cols];
        fillRect(0, 0, rows - 1, cols - 1, fill);
    }

    /*
     * Returns the number of rows in grid
     */
    public int numRows() {
        return m.length;
    }

    /*
     * Returns the number of columns in grid
     */
    public int numCols() {
        return m[0].length;
    }

    /*
     * Returns the character at the indexes [row, col]
     */
    public char charAt(int row, int col) {
        return m[row][col];
    }

    /*
     * Sets the character at index [row, col] to ch
     */
    public void setCharAt(int row, int col, char ch) {
        m[row][col] = ch;
    }

    /*
     * Returns true if the character at row, col is a SPACE,
     * false otherwise
     */
    public boolean isEmpty(int row, int col) {
        return m[row][col] == ' ';
    }

    /*
     * Fills the given rectangle with the fill characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        // see if you need to change this to a '<' sign instead
        for (int row = row0; row <= row1; row++) {
            for (int col = col0; col <= col1; col++) {
                m[row][col] = fill;
            }
        }
    }

    /*
     * Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void clearRect(int row0, int col0, int row1, int col1) {
        fillRect(row0, col0, row1, col1, ' ');
    }

    /*
     * Returns the count of all non-SPACE characters in row.
     */
    public int countInRow(int row) {
        int count = 0;
        if (row <= m.length) {
            for (int col = 0; col < m[0].length; col++) {
                if (m[row][col] != ' ')
                    count++;
            }
        }
        return count;
    }

    /*
     * Returns the count of all non-SPACE characters in col.
     */
    public int countInCol(int col) {
        int count = 0;
        if (col <= m[0].length) {
            for (int row = 0; row < m.length; row++) {
                if (m[row][col] != ' ')
                    count++;
            }
        }
        return count;
    }

    /*
     * Displays the contents of the matrix m
     */
    public void display() {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[r][c]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        CharMatrix matrix = new CharMatrix(3, 4, 'm');

        // program in your test cases here. Invoke methods from the
        // object called matrix, like this:

        matrix.display();
    }

}
