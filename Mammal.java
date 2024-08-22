public class Mammal extends Animal {
    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String makeSound() {
        return "Mammal sounds";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(",\tfurColor: " + this.getFurColor());
    }
}
