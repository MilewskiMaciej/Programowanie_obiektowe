public record Person(String firstName, String lastName, Address address, int age) {

    public Person(String firstName, String lastName, Address address, int age) {
        if(age < 0) {
            age = 0;
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }
}
