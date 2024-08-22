public class Animal {

    protected String name;
    protected int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes sound.");
    }

    public void displayInfo() {
        System.out.print("Animal name: " + name + ", age: " + age + ", ");
        makeSound();
    }

}
