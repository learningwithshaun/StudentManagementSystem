# Student Management System

For my design and implementation, I applied two principles from the SOLID principles:
- **Single Responsibility Principle (SRP)**
- **Open/Closed Principle (OCP)**

---

## Application of SRP in This Project

A class should have only one job and one reason to change. In this project, responsibilities are clearly separated into different classes:

1. **Student (Super-class)**  
   This is an abstract class that defines the behavior subclasses must implement.  
   It serves as an abstraction for all student types.

   Its single responsibility is to define student attributes (studentId, name, email, department) and declare abstract methods that subclasses must implement:
   - calculateTuition()
   - getStudentType()

   By focusing only on attributes and abstract methods, this class adheres to the Single Responsibility Principle.

2. **UndergraduateStudent and GraduateStudent (Subclasses)**  
   Each subclass has one responsibility: to define the behavior of a specific type of student.  
   They provide their own implementation of displayStudentDetails().

3. **Builder Classes**  
   Each subclass has its own Builder class.  
   The Builder’s responsibility is to construct student objects with required and optional attributes.  
   They do not perform logic such as calculating tuition or displaying details, this ensures that they fully support SRP.
---
### Application of OCP in This Project
Code should be open for extension, but closed for modification. Meaning you should be able to add new behavior without changing the existing code.  

The Student class (superclass) demonstrates this principle because its subclasses are able to inherit its attributes and methods. The Student class is designed to be extended without being modified.  

**References:**  
 Both the UndergraduateStudent and the GraduateStudent class use the keyword **extends** when they inherit the attributes and the methods of the Student class(open for extension).  

They can inherit these attributes and methods() but they can't modify the Student class. All they can do is implement the abstract methods() of the Student class and provided their own Builder class(closed for modification).