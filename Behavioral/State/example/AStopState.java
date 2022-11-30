package Behavioral.State.example;

public class AStopState implements State {

	@Override
	public void doAction() {
	
       System.out.println("Turned OFF");
	
    }

}