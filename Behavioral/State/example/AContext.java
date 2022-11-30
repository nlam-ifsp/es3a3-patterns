package Behavioral.State.example;

public class AContext implements State {

	private State aState;

	public void setState(State state) {
		this.aState = state;
	}

	public State getState() {
		return this.aState;
	}

	@Override
	public void doAction() {
		this.aState.doAction();
	}

}