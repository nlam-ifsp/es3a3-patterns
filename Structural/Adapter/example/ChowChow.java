package Structural.Adapter.example;

class ChowChow implements Dog{

    public void walk(){
        System.out.println("Walking");
    }

    public void makeSound() {
        System.out.println("Aw aw");
    }
}
