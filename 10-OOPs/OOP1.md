A **class** is :
 * a named group of properties(`variables`) and functions.
 * a template for an object, and an object is an instance of a class.
 * creates a *new data type* that can be used to *create objects*.


When you declare an object of a class, you are creating an instance of that class.

Thus, a *class* is a *logical construct*. An **object** has **physical reality**. (That is, an object occupies space in memory.)

Objects are characterized by three essential properties: 
 * *state*, 
 * *identity*, and 
 * *behavior*.

The `state of an object is a value from its data type`. The `identity of an object distinguishes one object from another`.

It is useful to ***think of an object's identity as the place where its value is stored in memory***. 

The behavior of an object is the effect of data-type operations.

The **dot operator** links the name of the object with the name of an *instance variable*.

**variables inside objects = instance variables**

Although commonly referred to as the dot operator, the formal specification for Java categorizes the `.` as a `separator`.

-----
 
1. The **'new'** keyword *dynamically allocates*(that is, allocates at run time)memory for an object & returns a reference to it. 
2. This reference is, more or less, the address in memory of the object allocated by new.
3. This reference is then stored in the variable.
4. Thus, in Java, all class objects must be dynamically allocated.

```java
Box mybox; // declare reference to object
mybox = new Box(); // allocate a Box object
```
The first line declares mybox as a reference to an object of type Box. At this point, mybox does not yet refer to an actual object. The next line allocates an object and assigns a reference to it to mybox. After the second line executes, you can use mybox as if it were a Box object. But in reality, mybox simply holds, in essence, the memory address of the actual Box object.

* The key to Java's safety is that you cannot manipulate references as you can actual pointers.
* Thus, you cannot cause an object reference to point to an arbitrary memory location or manipulate it like an integer.

A Closer Look at new:
```java
classname class-var = new classname ( );
```
Here, class-var is a variable of the class type being created. The classname is the name of the class that is being instantiated. The class name followed by parentheses specifies the constructor for the class. A constructor defines what occurs when an object of a class is created.
 
You might be wondering why you do not need to use new for such things as integers or characters.
> The answer is that Java's primitive types are not implemented as objects.

Rather, they are implemented as "normal" variables.
This is done in the interest of efficiency.

It is important to understand that new allocates memory for an object during run time.
```java
Box b1 = new Box();
Box b2 = b1;
```
b1 and b2 will *both refer to the same object*. The assignment of b1 to b2 did not allocate any memory or copy any part of the original object. It simply makes b2 refer to the same object as does b1. Thus, any changes made to the object through b2 will affect the object to which b1 is referring, since they are the same object.
When you assign one object reference variable to another object reference variable, you are not creating a copy of the object, you are only making a copy of the reference.

```java
int square(int i){
    return i * i;
}
```
A parameter is a variable defined by a method that receives a value when the method is called. For example,
in square( int i), i is a parameter. An argument is a value that is passed to a method when it is invoked.
For example, square(100) passes 100 as an argument. Inside square( ), the parameter i receives that value.

NOTE:
Bus bus = new Bus();
**lhs(reference i.e. bus) is looked by compiler** & <u>rhs (object i.e. new Bus()) is looked by jvm</u>



# this, final, finalize

The **this** Keyword: Sometimes a method will need to refer to the object that invoked it. To allow this, Java defines the this keyword. this can be used inside any method to refer to the current object. That is, this is always a reference to the object on which the method was invoked.

**final** Keyword: A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant. This means that you must initialize a final field when it is declared.

It is a common coding convention to choose all uppercase identifiers for final fields:
```java
    final int FILE_OPEN = 2;
```

Unfortunately, final guarantees immutability only when instance variables are primitive types, not reference types. If an instance variable of a reference type has the final modifier, the value of that instance variable (the reference to an object) will never change—it will always refer to the same object—but the value of the object itself can change.

The finalize( ) Method:
Sometimes an object will need to perform some action when it is destroyed.
To handle such situations, Java provides a mechanism called finalization. By using finalization,
you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
To add a finalizer to a class, you simply define the finalize( ) method. The Java run time calls that method whenever
it is about to recycle an object of that class. Right before an asset is freed, the Java run time calls the finalize( )
method on the object.

```java
protected void finalize( ) {
    // finalization code here
}
```

Constructors:

Once defined, the constructor is automatically called when the object is created, before the new operator completes.
Constructors look a little strange because they have no return type, not even void.
This is because the implicit return type of a class' constructor is the class type itself.

In the line
Box mybox1 = new Box();
new Box( ) is calling the Box( ) constructor.


Inheritance and constructors in Java:

In Java, constructor of base class with no argument gets automatically called in derived class constructor.
> The Base class construct is called before Derived class constructor

For example, output of following program given below is:
```
Base Class Constructor Called
Derived Class Constructor Called
```
```java

 // filename: Main.java
class Base {
  Base() {
    System.out.println("Base Class Constructor Called ");
  }
}

class Derived extends Base {
  Derived() {
    System.out.println("Derived Class Constructor Called ");
  }
}

public class Main {
  public static void main(String[] args) {
    Derived d = new Derived();
  }
}
```
Any class will have a default constructor, does not matter if we declare it in the class or not. If we inherit a class,
then the derived class must call its super class constructor. It is done by default in derived class.
If it does not have a default constructor in the derived class, the JVM will invoke its default constructor and call
the super class constructor by default. If we have a parameterised constructor in the derived class still it calls the
default super class constructor by default. In this case, if the super class does not have a default constructor,
instead it has a parameterised constructor, then the derived class constructor should call explicitly call the
parameterised super class constructor.