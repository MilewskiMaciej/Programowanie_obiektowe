public class Building {
    private int height;
    private String color;

    public Building(int height, String color) {
        this.height = height;
        this.color = color;
    }
}

class House extends Building {
    private int numberOfRooms;

    public House(int height, String color, int numberOfRooms) {
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }
}

