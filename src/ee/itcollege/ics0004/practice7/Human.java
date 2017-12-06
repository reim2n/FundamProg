package ee.itcollege.ics0004.practice7;

public class Human {

    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println(greetAsString());
    }

    public String greetAsString() {

        String greet;

        if(age < 3)
            greet = "Boo boo";
        else
            greet = String.format("Hello, I am %s and I am %d years old.", name, age);

        return greet;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
