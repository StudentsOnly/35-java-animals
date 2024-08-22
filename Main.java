public class Main{

    public static void main(String[] args) {

        Mammal mammal = new Mammal();
        Bird bird = new Bird();

        mammal.setName("Cat");
        mammal.setAge(3);
        mammal.setFurColor("brown");
        mammal.makeSound();
        mammal.displayInfo();
        System.out.println();

        bird.setName("Finch");
        bird.setAge(1);
        bird.setFeatherColor("gray");
        bird.makeSound();
        bird.displayInfo();

    }

}
