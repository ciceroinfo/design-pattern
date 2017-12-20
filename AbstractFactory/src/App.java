import color.Color;
import color.ColorFactory;
import shape.Shape;
import shape.ShapeFactory;
import factory.AbstractFactory;
import factory.FactoryProducer;

public class App {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		Shape circle = shapeFactory.getShape("CIRCLE");
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		Shape square = shapeFactory.getShape("SQUARE");

		circle.draw();
		square.draw();
		rectangle.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		Color red = colorFactory.getColor("RED");
		Color blue = colorFactory.getColor("BLUE");
		Color purple = colorFactory.getColor("PURPLE");

		red.fill();
		purple.fill();
		blue.fill();

	}
}
