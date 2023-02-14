public class Person {
    private String name;
    public Person() {
        this("");
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.format("This person's name is %s%n", this.name);
    }

    public static void main(String[] args) {
        Person Stephen = new Person();
        Stephen.setName("Stephen");
        Stephen.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }


    //accessors
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
