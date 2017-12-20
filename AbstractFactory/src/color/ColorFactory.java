package color;

import factory.AbstractFactory;
import shape.Shape;

public class ColorFactory extends AbstractFactory {

  @Override
  public Color getColor(String colorType) {

    if (colorType.equalsIgnoreCase("BLUE")) {
      return new Blue();
    } else if (colorType.equalsIgnoreCase("RED")) {
      return new Red();
    } else if (colorType.equalsIgnoreCase("PURPLE")) {
      return new Purple();
    }

    return null;
  }

  @Override
  public Shape getShape(String shape) {
    return null;
  }
}
