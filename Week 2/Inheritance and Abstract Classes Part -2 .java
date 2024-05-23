### Application Program Development: Interfaces and Implementations

#### Outcomes
- Understand multiple inheritance in Java
- Understand interfaces in Java

### Inheritance and Class Hierarchy
Inheritance allows classes along the same path in the class hierarchy to share attributes and behaviors. The class hierarchy helps identify common behaviors between subclasses and their superclasses. But how do we define common behavior between seemingly unrelated classes?

### Multiple Inheritance
Java does not support multiple inheritance directly to avoid the "diamond problem." This problem occurs when a class inherits from two classes that have a common superclass, leading to ambiguity.

### Interfaces
An interface is a specification of methods that any implementing class must define. It’s like a contract that ensures the implementing class will provide certain behavior. Interfaces contain only constants and abstract methods (methods without a body).

**Example of an Interface:**
```java
public interface Sharable {
    String getItemData();
}
```
- Interfaces cannot be instantiated.
- They can be implemented by classes or extended by other interfaces.
- Members of an interface are public by default.

### Differences Between Abstract Classes and Interfaces

**Abstract Classes:**
- Can have both abstract and non-abstract methods.
- Can contain fields and constants.
- Supports constructor chaining.

**Interfaces:**
- Can only have abstract methods (though Java 8 introduced default methods with implementation).
- Cannot contain instance fields.
- All methods are implicitly public and abstract.

### Example of Abstract Classes and Interfaces
**Abstract Class:**
```java
public abstract class Animal {
    public abstract String sound();
}
```

**Interface:**
```java
public interface Edible {
    String howToEat();
}
```

**Implementing Interface in Classes:**
```java
public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: Cluck cluck";
    }
}
```

**Testing Implementation:**
```java
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Chicken()};
        
        for (Object obj : objects) {
            if (obj instanceof Edible) {
                System.out.println(((Edible)obj).howToEat());
            }
            if (obj instanceof Animal) {
                System.out.println(((Animal)obj).sound());
            }
        }
    }
}
```

### Common Java Interfaces
- **Comparable:** Used to compare objects for ordering.
- **Serializable:** Identifies classes whose objects can be serialized.
- **Runnable:** Used for classes that represent a task in multithreading.
- **AutoCloseable:** For classes that need to release resources automatically.
- **ActionListener:** For handling events like button clicks.

### Key Concepts
- **Inheritance** allows classes to inherit properties and behaviors from another class.
- **Interfaces** define methods that must be implemented by any class that implements the interface.
- **Abstract Classes** can have both defined methods and methods that must be implemented by subclasses.

This segment highlights how Java handles multiple inheritance using interfaces and explains the difference between abstract classes and interfaces. It ensures a clear understanding of how to organize and define behavior across unrelated classes.