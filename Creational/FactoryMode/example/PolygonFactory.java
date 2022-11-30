package example;

public class PolygonFactory {

    public static Polygon makePolygon(int sides) {
		if (sides == 3)
			return new Triangle();
		else
			return new Square();
	}

}