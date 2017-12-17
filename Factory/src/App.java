public class App {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape circle = sf.getShape("CIRCLE");
		Shape rectangle = sf.getShape("RECTANGLE");
		Shape square = sf.getShape("SQUARE");
		
		circle.draw();
		square.draw();
		rectangle.draw();
	}
}