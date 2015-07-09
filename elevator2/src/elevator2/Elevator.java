package elevator2;

public class Elevator extends ElevatorDoor {
	
	int currentFloor;
	String elevatorDoor;
	
	public Elevator(String edstate,int currentFloor, String elevatorDoor) {
		this.currentFloor = currentFloor;
		this.elevatorDoor = elevatorDoor;
		super.edstate=edstate;
	}
	

}
