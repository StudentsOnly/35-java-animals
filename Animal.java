public abstract class Animal {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound() {
        return null;
    }

    public void displayInfo() {
        System.out.print("Animal: " + this.getClass().getName() +
                ",\tName: " + this.getName() +
                ",\tAge: " + this.getAge() +
                ",\tSound: " + this.makeSound());
    }
}
