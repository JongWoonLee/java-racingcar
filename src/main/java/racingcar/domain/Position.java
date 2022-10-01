package racingcar.domain;

public class Position {

    private final int value;

    public Position(int value) {
        this.value = value;
    }

    public Position(Position position, int move_length) {
        this(position.getValue() + move_length);
    }

    public int getValue() {
        return value;
    }

    public Position increase(int count) {
        return new Position(value + count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }

        Position position1 = (Position) o;

        return value == position1.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}