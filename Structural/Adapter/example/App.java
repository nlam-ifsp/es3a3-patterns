package Structural.Adapter.example;

//Usage on built-in Java classe: java.util.Arrays#asList()

public class App {
    public static void main(String args[])
    {
        ChowChow chowchow = new ChowChow();
        ToyDog toyDog = new PlasticToyDog();
        ToyDog dogAdapter = new DogAdapter(chowchow);
  
        System.out.println("ChowChow...");
        chowchow.makeSound();
  
        System.out.println("ToyDog...");
        toyDog.squeak();
  
        System.out.println("DogAdapter...");
        dogAdapter.squeak();
    }
}
