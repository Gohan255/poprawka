package task1.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import task1.interfaces.IShape;

//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({

        @JsonSubTypes.Type(value = Square.class, name = "square"),
        @JsonSubTypes.Type(value = Circle.class, name = "circle"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle")
})
public abstract class Shape implements IShape {

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}
