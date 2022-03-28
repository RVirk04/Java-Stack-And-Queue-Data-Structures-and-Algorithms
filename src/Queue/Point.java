package Queue;

/**
 * The Point class used implements an application that
 * will store and process the stack, and queue data.
 *
 * @author Randeep Singh Virk
 * @version 1.0
 * @since 2022-02-18
 * @updated 2022-03-18
 */
public class Point {

    /**
     * Private variables to store row and column data.
     */
    private final int row;
    private final int column;
    private Point parent; // Previous point

    //region Methods

    /**
     * Instance constructor with two parameters row and column.
     *
     * @param row    The row value.
     * @param column The column value.
     */
    public Point(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Instance constructor with three parameters row, column, and parent.
     *
     * @param row The row value.
     * @param column The column value.
     * @param parent The parent object.
     */
    public Point(int row, int column, Point parent) {
        this.row = row;
        this.column = column;
        this.parent = parent;
    }

    /**
     * Gets the row value.
     *
     * @return Returns the row value.
     */
    public int getRow() {
        return row;
    }

    /**
     * Gets the column value.
     *
     * @return Returns the column value.
     */
    public int getColumn() {
        return column;
    }

    /**
     * Gets the parent.
     *
     * @return Returns the parent value.
     */
    public Point getParent(){ return parent; }

    /**
     * Returns the string consisting row, and column value(i.e. [2, 3]).
     *
     * @return Returns the string consisting row, and column value.
     */
    @Override
    public String toString() {
        return "[" + getRow() + ", " + getColumn() + "]";
    }

    //endregion
}

