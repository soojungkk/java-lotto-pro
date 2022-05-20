package lotto;

import java.util.Objects;

public class Number {

    public static final int MIN_RANGE_NUMBER = 1;
    public static final int MAX_RANGE_NUMBER = 45;

    private final int value;

    public Number(int input) {
        checkRange(input);
        this.value = input;
    }

    private void checkRange(int input) {
        if (input < MIN_RANGE_NUMBER || input > MAX_RANGE_NUMBER) {
            throw new IllegalArgumentException("로또 숫자 범위에서 아닙니다.");
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return value == number.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
