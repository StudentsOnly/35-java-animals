public class Mammal extends Animal {

    private String furColor;

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes sound.");
    }

//    @Override
//    public void displayInfo() {
//       super.displayInfo();
//       System.out.println("Fur color: " + furColor);
//    }

}
