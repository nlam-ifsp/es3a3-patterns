package Creational.Builder.example;

//Usage on built-in Java classe: implementantions of java.lang.StringBuilder

public class App {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("John", "Doe")
        .age(30)
        .phone("09876")
        .address("Fake addr 1234")
        .build();

        System.out.println(user1);
    }
}
