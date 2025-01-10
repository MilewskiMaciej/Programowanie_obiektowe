class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}

class Animal {
    public static void findMinMaxAge(Dog[] dogs, Pair<?super Dog> result) {
        Dog min = dogs[0];
        Dog max = dogs[0];

        for(Dog dog : dogs) {
            if(dog.getAge() < min.getAge()) {
                min = dog;
            }
            if(dog.getAge() > max.getAge()) {
                max = dog;
            }
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(1), new Dog(5), new Dog(2)};
        Pair<Dog> result = new Pair<>(null, null);
        findMinMaxAge(dogs, result);
        System.out.println(((Dog) result.getFirst()).getAge());
        System.out.println(((Dog) result.getSecond()).getAge());
    }
}

class Dog extends Animal {
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}