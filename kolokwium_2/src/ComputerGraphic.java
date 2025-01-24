public abstract class ComputerGraphic {
    private int width;
    private int height;
    private String fileName;

    public ComputerGraphic(int width, int height, String fileName) {
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }

    public abstract void loadFile();

    public abstract void saveFile();
}

class Bitmap extends ComputerGraphic {
    public Bitmap(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Ładowanie...");
    }

    @Override
    public void saveFile() {
        System.out.println("Zapisywanie...");
    }
}


class Vector extends ComputerGraphic {
    public Vector(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Ładowanie...");
    }

    public void saveFile() {
        System.out.println("Zapisywanie...");
    }
}
