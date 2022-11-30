package Behavioral.State.example;

//Usage on built-in Java classe: 

public class App {
    public static void main(String[] args) {
		AContext context = new AContext();
		State startState = new AStartState();
		State stopState = new AStopState();
		
		context.setState(startState);
		context.doAction();		
		
		context.setState(stopState);
		context.doAction();
		
	}
}