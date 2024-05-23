### Application Program Development: Interfaces and Implementations

#### Week 2 Agenda
- **Lecture:**
  - Inheritance
  - Abstract classes
  - Multiple Inheritance & Interfaces
  - Organizing Classes
  - Java Interfaces
- **Lab:**
  - Test 1

#### Outcomes
- Organize classes effectively
- Understand Inheritance
- Understand Abstract classes

### Organizing Classes
When defining objects, each class should be in its own file (e.g., Car, Person, Address, Bank). Some objects share common attributes. For example, Person, Employee, Manager, Customer, and Company may all have `name` and `phoneNumber` attributes. Java allows you to organize classes to take advantage of these commonalities.

### Class Hierarchy
A class hierarchy is like an upside-down tree where child objects are more specific versions of their parent objects. This creates an "is-a" relationship between classes. Each class is a subclass (specialization) of a superclass (generalization).

### Inheritance
A subclass inherits attributes and methods from its superclass. In Java, you create a subclass using the `extends` keyword.

**Example:**
```java
public class SubClass extends SuperClass {
    // Subclass inherits from SuperClass
}
```

### Constructor Chaining
When creating an instance of a class, all superclass constructors are called along the inheritance chain. This is called constructor chaining. Use the `super` keyword to call a superclass constructor.

**Example:**
```java
public class Employee extends Person {
    public Employee() {
        super(); // Calls the constructor of Person
    }
}
```

### Abstract Classes
An abstract class cannot be instantiated and is meant to be subclassed. It can contain abstract methods, which are methods without a body that must be implemented by subclasses.

**Example:**
```java
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
```

### Concrete Classes
Concrete classes provide implementations for all abstract methods and can be instantiated.

**Example:**
```java
public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
```

### Interfaces
Interfaces in Java allow multiple inheritance of type. An interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors.

**Example:**
```java
public interface Drawable {
    void draw();
}

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

### Key Concepts

**Inheritance:**
- Subclass inherits from superclass.
- Use `extends` keyword.

**Abstract Classes:**
- Defined with the `abstract` keyword.
- Cannot be instantiated.
- Can have abstract methods that must be implemented by subclasses.

**Interfaces:**
- Defined with the `interface` keyword.
- Can have abstract methods.
- Classes implement interfaces using the `implements` keyword.

### Summary
This week focuses on organizing classes, understanding inheritance, abstract classes, and interfaces. These concepts help in creating a structured and efficient codebase, making it easier to manage and extend.

### Question Time
- **How does Java handle memory management?**
  - Destructor
  - Delete Keyword
  - Remove Keyword
  - Garbage Collected