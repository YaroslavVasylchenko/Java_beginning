public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = "30";
        Values person1Name = new Values();
        person1Name.name = "Sam";
        person1.printAge();
        person1.sayHello();
        person1Name.printName();


        Person person2 = new Person();
        person2.age = "50";
        Values person2Name = new Values();
        person2Name.name = "Kate";
        person2.printAge();
        person2.sayHello();
        person2Name.printName();

    }

}

class Values {
    String name;

    void printName() {
        System.out.printf("my name  is %s%n", name);
        System.out.println();

    }


}

