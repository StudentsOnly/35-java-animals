public class Bird extends Animal {
    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String makeSound() {
        return "Bird sounds";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(",\tFeather color: " + this.getFeatherColor());
    }
}
