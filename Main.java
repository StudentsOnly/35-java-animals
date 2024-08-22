public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.setName("Bob");
        mammal.setAge(5);
        mammal.setFurColor("Red");
        mammal.displayInfo();

        Bird bird = new Bird();
        bird.setName("John");
        bird.setAge(2);
        bird.setFeatherColor("Blue");
        bird.displayInfo();
    }
}
