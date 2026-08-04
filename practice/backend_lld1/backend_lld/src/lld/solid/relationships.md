# Java Object Relationships Cheat Sheet

This document summarizes the core relationships between classes and interfaces in Java, including their conceptual meanings and code implementations.

---

## Quick Reference Summary

| Relationship Type | Definition | Keywords / Syntax | Code Representation |
| :--- | :--- | :--- | :--- |
| **Inheritance** | "Is-A" (Class to Class) | `extends` | `class A extends B {}` |
| **Realization** | "Is-A" (Class to Interface) | `implements` | `class A implements B {}` |
| **Association** | "Has-A" (Generic connection) | Field reference | `class A { private B b; }` |
| **Aggregation** | "Has-A" (Loose / Independent) | Field via constructor | `public A(B b) { this.b = b; }` |
| **Composition** | "Has-A" (Strict / Owned) | Created internally | `public A() { this.b = new B(); }` |
| **Dependency** | "Uses-A" (Temporary short-term) | Method parameter / local | `void process(B b) { b.doSomething(); }` |

---

## 1. Inheritance (Is-A Class)
A child class inherits the fields and methods of a parent class. It reuse code directly.

```java
// Parent Class
class Vehicle {
    void move() { System.out.println("Moving..."); }
}

// Child Class (Is-A Vehicle)
class Car extends Vehicle {
    void honk() { System.out.println("Beep!"); }
}
```

---

## 2. Realization (Is-A Interface)
A class signs a contract to implement the abstract behaviors defined by an interface.

```java
// Interface
interface Drivable {
    void drive();
}

// Concrete Class (Is-A Drivable)
class Truck implements Drivable {
    public void drive() {
        System.out.println("Truck is driving.");
    }
}
```

---

## 3. Aggregation (Has-A: Independent Lifecycle)
An object contains another object, but the inner object can survive if the outer object is destroyed. The inner object is passed into the constructor from outside.

```java
class Department {
    private String name;
    public Department(String name) { this.name = name; }
}

class University {
    private Department department; // Has-A Department

    // Aggregation: Department is created outside and passed in
    public University(Department department) {
        this.department = department;
    }
}
// If University is destroyed, the Department object still exists outside!
```

---

## 4. Composition (Has-A: Shared Lifecycle)
An object completely owns another object. The inner object cannot exist without the outer object. It is created directly inside the outer object.

```java
class Engine {
    public void start() { System.out.println("Engine vroom!"); }
}

class RaceCar {
    private final Engine engine; // Has-A Engine

    // Composition: Engine is born and dies with the RaceCar
    public RaceCar() {
        this.engine = new Engine(); 
    }
}
// If RaceCar is destroyed, the Engine is destroyed as well.
```

---

## 5. Dependency (Uses-A)
A class does not store the other object as a field. It only interacts with it temporarily as a method parameter or local variable.

```java
class Document {
    public void getContent() { /* ... */ }
}

class Printer {
    // Dependency: Printer temporary 'uses' a Document to print
    public void print(Document doc) {
        doc.getContent();
    }
}
```
