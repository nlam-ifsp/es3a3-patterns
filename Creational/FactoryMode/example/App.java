package example;

public class App {
    public static void main(String[] args) {


        Triangle trg = (Triangle) PolygonFactory.makePolygon(3);

        System.out.println(trg.getNumberOfSides());
        
    }
}
