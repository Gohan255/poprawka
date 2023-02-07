package task1.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

@JsonTypeName("square")
public class Square extends Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public Square() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculatePerimeter() {
        return length * 4;
    }


}
