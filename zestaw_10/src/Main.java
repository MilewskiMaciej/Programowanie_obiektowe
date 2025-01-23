import java.util.Arrays;
import java.util.Comparator;

class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String toString() {
        return "Samochod{marka=" + marka + ", rokProdukcji=" + rokProdukcji + ", cena=" + cena + "}";
    }
}

class RokProdukcjiComparator implements Comparator<Samochod> {
    @Override
    public int compare(Samochod s1, Samochod s2) {
        return Integer.compare(s1.getRokProdukcji(), s2.getRokProdukcji());
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name=" + name + ", price=" + price + "}";
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int priceComparison = Double.compare(p1.getPrice(), p2.getPrice());
        if(priceComparison == 0) {
            return Integer.compare(p1.getId(), p2.getId());
        }
        return priceComparison;
    }
}

class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{title=" + title + ", artist=" + artist + ", duration=" + duration + "}";
    }
}

class DurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        return Integer.compare(s1.getDuration(), s2.getDuration());
    }
}

class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        int artistComparsion = s1.getArtist().compareToIgnoreCase(s2.getArtist());
        if(artistComparsion == 0) {
            return s1.getTitle().compareToIgnoreCase(s2.getTitle());
        }
        return artistComparsion;
    }
}

class Student implements Cloneable {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", age=" + age + ", grade=" + grade + "}";
    }
}

class Employee implements Cloneable {
    private String name;
    private double[] salaries;

    public Employee(String name, double[] salaries) {
        this.name = name;
        this.salaries = salaries.clone();
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalary(int month, double salary) {
        if(month >= 0 && month < 12) {
            this.salaries[month] = salary;
        } else {
            throw new IllegalArgumentException("Month must be between 0 and 12");
        }
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.salaries = this.salaries.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Employee{name=" + name + ", salaries=" + Arrays.toString(salaries) + "}";
    }
}

class HeadTeacher extends Teacher {
    private double bonus;

    public HeadTeacher(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public HeadTeacher clone() {
        HeadTeacher cloned = (HeadTeacher) super.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus=" + bonus;
    }
}

class Teacher implements Cloneable {
    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Teacher clone() {
        try {
            return (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Teacher{name=" + name + ", age=" + age + ", salary=" + salary + "}";
    }
}

class Engine implements Cloneable {
    private int power;
    private String type;
    private String serialNumber;

    public Engine(int power, String type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{power=" + power + ", type=" + type + ", serialNumber=" + serialNumber + "}";
    }
}

class Car implements Cloneable {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public Car clone() {
        try {
            Car cloned = (Car) super.clone();
            cloned.engine = this.engine.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Car{make=" + make + ", model=" + model + ", engine=" + engine + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student("Joe Mama", 20, 4.5);
        Student clonedStudent = originalStudent.clone();
        originalStudent.setGrade(3.0);
        System.out.println(originalStudent);
        System.out.println(clonedStudent);
    }
}

