public class Person {
    private String name;
    public Person() {
        this("");
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("This person's name is %s%n", this.name);
    }

    public static void main(String[] args) {
        Person Stephen = new Person();
        Stephen.setName("Stephen");
        Stephen.sayHello();
    }

    //accessors
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
