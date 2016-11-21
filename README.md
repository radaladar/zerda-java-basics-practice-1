# EXAM: Java Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
 - You can use any resource online, but **please work individually**
 - Instead of copy-pasting your answers and solutions, write them in your own words.


# Tasks
## 1. Setup a new project (~5 mins) [5p]
- Create a new project inside your cloned repository
- Setup `.gitignore` file to exclude the IDE's generated files
    - Just the src directory should be committed

## 2. The Garden Application (~90 mins) [15p]
The task is to create a garden application, so in your main method you should create a garden with flowers and trees. The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange). In the example after creating them you should show the user, how the garden looks like. After that the program should water the garden twice, first with the amount of `40` then with `70`. And after every watering the user should see the state of the garden as you can see in the output.

The output should look like this:
```
The yellow Flower needs water
The blue Flower needs water
The purple Tree needs water
The orange Tree needs water

Watering with 40
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree needs water
The orange Tree needs water

Watering with 70
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree doesnt need water
The orange Tree doesnt need water
```
### Information on the elements
- The Garden
    - is able to hold unlimited amount of flowers or trees
    - when watering it should only water those what needs water with equally divided amount amongst them
        - eg. watering with `40` and 4 of them need water then each gets watered with `10`
- The Flower
    - needs water if its current water amount is less then `5`
    - when watering it the flower can only absorb the `75%` of the water
        - eg. watering with `10` the flower's amount of water should only increase with `7.5`
- The Tree
    - needs water if its current water amount is less then `10`
    - when watering it the tree can only absorb the `40%` of the water
        - eg. watering with `10` the tree's amount of water should only increase with `4`

### Acceptance criteria
The application is accepted if:
- The solution has the same output [2p]
- Necessary classes are created [3p]
- Good usage of abstract classes and methods [2p]
- Methods and fields are in the right classes [2p]
- Good usage of constructors [1p]
- The main method contains
    - creating the example [1p]
    - watering the garden twice [1p]
    - souting the garden [1p]
- Souting only in the main method [2p]

## 3. Understand the code (~10 mins) [4p]
```java
class Apple {
  public Apple() {
    System.out.println("Apple is created");
  }
}

class Blackberry {
  public Blackberry() {
    System.out.println("Blackberry is created");
  }

  public static int getNumber() {
    return 4;
  }
}

class Main {
  public static void main(String... args) {
    Blackberry b = new Blackberry();
    System.out.println(Blackberry.getNumber());
  }
}
```

What's wrong with the following output? What would be the actual output? [2p] Modify what you need to correct this! [2p]
```
Blackberry is created
4
```

#### Explain what you did, and answer the questions here:
The actual output is an error message signaling that non-static method `getNumber` cannot be referenced. This is due to the fact that the method is called not on an instance of Blackberry (such as b), but the object itself. If `getNumber` was a static method it could have a return value even if Blackberry is uninstanciated.

To get the supposed output, we have to either call `getNumber` on b, or make it a static method. (In this case I've done the latter)

However, there is one more problem. As Blackberry extends Apple, the message "Apple is created", is printed whenever a Blackberry is created.

Thus, we have a number of options, we can either make Apple an abstract class or interface, so Blackberry would have to override Apple's constructor. Or not extend Apple with Blackberry. I would argue that this latter solution makes more semantical sense (With maybe both extending an abstract SmartPhone superclass.)

My modifications can be seen in the code snippet above.

## 4. Question time! (~20 mins) [6p]

### Whats the difference between a Class and an Object? [2p]
#### Your answer:
A Class is the blueprints containig fields, constructors, getters and setters, and other methods (or possibly only an executable main method). While an Object is an instance of a class created and its fields assigned values by a constructor method.

### What is the superclass when a class doesnt extend anything? What methods will it inherit (the two most important is enough)? [2p]
#### Your answer:
The superclass will default to the Object class. It will inherit the following methods: clone(), equals(), finalize(), getClass(), hashCode(), toString().

### What is polymorphism? [2p]
#### Your answer:
Polymorphism is the ability of Objects in Java to take different forms depending on what methods are invoked on them. The most common example for this is when a parent class reference is used on a child class object.
