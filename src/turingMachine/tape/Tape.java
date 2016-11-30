package turingMachine.tape;

import turingMachine.Direction;

/**
 *
 * @author jk
 */
public interface Tape {

    public char read();

    public void write(char character);

    public void move(Direction direction);

    public String print();
}