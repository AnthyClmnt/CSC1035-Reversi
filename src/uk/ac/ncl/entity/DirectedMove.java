/**
 * @author Kostiantyn Potomkin
 * @version 0.9
 * @since 05-03-2020
 */
package uk.ac.ncl.entity;

public class DirectedMove {

    private Cell cell;

    private int[] direction;


    public DirectedMove(Cell cell, int[] direction) {

        this.direction = direction;
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }

    public int[] getDirection() {
        return direction;
    }
}
