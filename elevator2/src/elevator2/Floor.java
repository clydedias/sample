package elevator2;

public class Floor extends FloorDoor{

	static int totalFloors;
	
	Floor(int totFloor)
	{
		totalFloors=totFloor;
	}
	
	static int[] floors =new int[totalFloors];
	
}
