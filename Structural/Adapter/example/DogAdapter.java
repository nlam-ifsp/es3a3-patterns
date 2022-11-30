package Structural.Adapter.example;

class DogAdapter implements ToyDog {
    Dog dog;

    public DogAdapter(Dog dog){
        this.dog = dog;
    }
  
    public void squeak() {
        dog.makeSound();
    }
}
