package factory;

import color.Color;
import shape.Shape;

public abstract class AbstractFactory {
  public abstract Color getColor(String color);
  public abstract Shape getShape(String shape);
}
