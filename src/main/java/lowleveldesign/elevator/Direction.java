package lowleveldesign.elevator;

public enum Direction {
    UP,
    DOWN,
    NONE;

    public static class Display {
        private int floor;
        private Direction direction;
    }
}
