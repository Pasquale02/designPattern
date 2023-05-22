package state;

abstract class State {
	public void pull(Chain wrapper) {
		// off è l'ultima condizione nell'else
		wrapper.setState(new Off());
		System.out.println("   turning off");
	}

}
