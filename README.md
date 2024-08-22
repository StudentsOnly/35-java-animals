## Exercise: Inheritance - Animals

#### Objective:

Practice inheritance by creating a hierarchy of animal classes.

#### Description:

You should create a set of animal classes using inheritance. There should be a base class Animal, and two derived classes: Mammal and Bird. The base class Animal should have common attributes like name, age, and methods to set these attributes. The derived classes should inherit these attributes and methods and add their own attributes and methods for specific types of animals.

#### Guidelines:

1.	Create a base class Animal with the following attributes:
    - String name
    - int age
2.	Implement the following methods in the Animal class:
    - public void setName(String name) - to set the name of the animal.
    - public void setAge(int age) - to set the age of the animal.
    - public void makeSound() - a placeholder method for making sounds. This method should be overridden by derived classes.
    - public void displayInfo() - to display the name, age, and sound of the animal.
4.	Create a derived class Mammal that inherits from Animal and has the following additional attributes:
    - String furColor
5.	Implement the following methods in the Mammal class:
    - Override the makeSound() method to make a mammal-specific sound (e.g., "Mammal sound").
6.	Create another derived class Bird that inherits from Animal and has the following additional attributes:
    - String featherColor
7.	Implement the following methods in the Bird class:
    - Override the makeSound() method to make a bird-specific sound (e.g., "Bird sound").
8.	In the main method, create instances of Mammal and Bird, set their attributes, make sounds, and display their information.
