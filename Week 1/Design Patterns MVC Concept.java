### Application Program Development: MVC Pattern

#### Segment: MVC Pattern

#### Outcomes
1. **Understanding the concept of Design Pattern.**
2. **Understanding why design patterns are needed.**
3. **Understanding the Model View Controller (MVC) Design Pattern.**

### What is a Design Pattern?
- **Designing object-oriented software is hard.** Creating reusable software is even harder.
- **Specific yet general.** Our design should solve the current problem but also be adaptable for future problems.
- **Minimize redesign.** Avoiding redesign as much as possible is crucial.
- **Reusability.** Design patterns help in reusing successful designs and architectures.
- **Better alternatives.** They help choose design alternatives that enhance reusability and avoid those that do not.
- **Improved documentation and maintenance.** They can make systems easier to document and maintain.

### Understanding Design Patterns
- **Not data structures.** Design patterns are not like linked lists or hash tables that can be reused as they are.
- **Not complex applications.** They are not complex, domain-specific designs for entire applications or subsystems.
- **Communicating objects and classes.** They describe how objects and classes interact to solve a design problem.
- **Roles and responsibilities.** Each design pattern identifies the roles of participating classes and their collaborations.

### What is MVC (Model-View-Controller)?
- **Software design pattern.** MVC separates software into three elements: Model, View, and Controller.

### MVC Components

#### Model
- **Manages data.** It handles data of the application and is central to any MVC project.
- **Independent of representation.** The model doesn't know how data is displayed or managed in the application workflow.
- **Example: Employee.java**
    ```java
    public class Employee {
        private String EmployeeName;
        private String EmployeeId;

        public String getId() {
            return EmployeeId;
        }

        public void setId(String id) {
            this.EmployeeId = id;
        }

        public String getName() {
            return EmployeeName;
        }

        public void setName(String name) {
            this.EmployeeName = name;
        }
    }
    ```

#### View
- **Presentation layer.** Describes how data is presented to the user.
- **Different modes and technologies.** Views can vary from paged tables to web pages, mobile apps, or desktop GUIs.
- **Example: EmployeeView.java**
    ```java
    public class EmployeeView {
        public void printEmployeeDetails(String EmployeeName, String EmployeeId) {
            System.out.println("Employee Details:");
            System.out.println("Name: " + EmployeeName);
            System.out.println("Employee ID: " + EmployeeId);
        }
    }
    ```

#### Controller
- **Handles user input.** It prepares data for the view and processes user input.
- **Application logic.** Contains the logic to determine what the application should do next.
- **Example: EmployeeController.java**
    ```java
    public class EmployeeController {
        private Employee model;
        private EmployeeView view;

        public EmployeeController(Employee model, EmployeeView view) {
            this.model = model;
            this.view = view;
        }

        public void setEmployeeName(String name) {
            model.setName(name);
        }

        public void setEmployeeId(String id) {
            model.setId(id);
        }

        public String getEmployeeId() {
            return model.getId();
        }

        public void updateView() {
            view.printEmployeeDetails(model.getName(), model.getId());
        }
    }
    ```

### Main Class Example
```java
public class MVCMain {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        controller.setEmployeeName("Frank");
        System.out.println("\nEmployee Details after updating:");
        controller.updateView();
    }
}
```
### Why Do We Need Design Patterns?
- **Accelerate development.** They speed up the development process.
- **Handle objects efficiently.** They help manage objects and their interactions.
- **Fun and efficiency.** They make development more fun and efficient.
- **Garbage collection.** They help manage garbage collection effectively.

### Summary
- **Model:** Manages data and business logic.
- **View:** Displays data and user interface elements.
- **Controller:** Handles user input and updates the model and view accordingly.

Design patterns and the MVC framework make it easier to create reusable, maintainable, and scalable software by clearly separating concerns and defining specific roles for each component.