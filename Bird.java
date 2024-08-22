public class Bird extends Animal {

    private String featherColor;

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes sound.");
    }

//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("The bird is " + featherColor + ".");
//    }

}
