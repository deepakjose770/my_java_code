package lowleveldesign.elevator;


public class ElevatorCar {

    int id;
    private Door door;
    private Display display;
    private Button button;

    private int currentFloor;
    private Direction direction;

    public ElevatorCar(int id) {
        this.id = id;
        door = new Door();
        display = new Display();
        currentFloor = 0;
        direction = Direction.NONE;
        button = new InternalButton();
    }

    public void move(Direction direction, int floor) {
        System.out.println(" Elevator "+ id + " is moving "+ direction);
        System.out.println("Elevator "+ id + "stops at floor" + floor);
        door.open(id);
        door.close(id);
        setDisplay(); // Called everytime when currFloor value changes
    }

    public void pressButton(int floor) {
        Direction dir = Direction.NONE;
        if(floor > currentFloor) {
            dir = Direction.UP;
        } else if (floor < currentFloor) {
            dir = Direction.DOWN;
        }
        button.pressBUtton(floor, dir, id);
    }

    private void setDisplay() {
        display.setFloor(currentFloor);
        display.setDirection(direction);
    }
}
