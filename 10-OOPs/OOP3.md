# Inheritance

To inherit a class, you simply incorporate the definition of one class into another by using the extends keyword.

```java
class subclass-name extends superclass-name { // body of class
}
```

> You can only specify `one superclass for any subclass` that you create. Java does not support the inheritance of multiple superclasses into a single subclass. You can, as stated, create a hierarchy of inheritance in which a subclass becomes a superclass of another subclass. However, `no class can be a superclass of itself`.

> Although a *subclass* includes all of the members of its superclass, it *cannot access those members of the superclass that have been declared as private*.

> A ***`Superclass Variable Can Reference a Subclass Object`***:
> It is important to understand that <u>***it is the type of the reference variable—not the type of the object that it refers to—that determines what members can be accessed***</u>.
> When a reference to a subclass object is assigned to a superclass reference variable, you <u>*will have access only to those parts of the object defined by the superclass*</u>.


```java
plainbox      =  weightbox;
(superclass)     (subclass)

SUPERCLASS ref = new SUBCLASS();    // HERE ref can only access methods which are available in SUPERCLASS
```


### Using super:

Whenever a subclass needs to refer to its ***immediate superclass***, it can do so by use of the keyword super.
super has two general forms. The first **calls the superclass' constructor**.
The second is used to **access a member of the superclass that has been hidden by a member of a subclass**.
```java
BoxWeight(double w, double h, double d, double m) {
    super(w, h, d); // call superclass constructor
    weight = m;
}
```
> Here, `BoxWeight()` calls `super()` with the arguments `w`, `h`, and `d`. This causes the `Box()` constructor to be called, which initializes width, height, and depth using these values. *`BoxWeight()` no longer initializes these values itself*.
> 
> It only needs to initialize the value unique to it: `weight`. This leaves Box free to make these values private if desired.

Thus, `super()` always refers to the superclass immediately above the calling class.
This is true even in a multileveled hierarchy.

```java
class Box {
     private double width;
     private double height;
     private double depth;

     // construct clone of an object

     Box(Box ob) { // pass object to constructor
       width = ob.width;
       height = ob.height;
       depth = ob.depth;
     }
}

class BoxWeight extends Box {
     double weight; // weight of box

     // construct clone of an object

     BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
     }
}
```
>!!! Notice that `super()` is passed an object of type `BoxWeight`—not of type `Box`.This still invokes the constructor `Box(Box ob)`.
>!!! NOTE: A superclass variable can be used to reference any object derived from that class.
Thus, we are able to pass a BoxWeight object to the Box constructor.Of course,Box only has knowledge of its own members.
> this is exaclt same concept as 
```Java
Box ob1 = new BoxWeight(5.0, 10);
```

<details>
<summary>
<code>Box.java</code>
</summary>

```java
package OOP3;

public class Box {
   double l, h, w;

   Box() {
      this.l = -1;
      this.h = -1;
      this.w = -1;
   }

   Box(double side) {
      this.l = side;
      this.h = side;
      this.w = side;
   }

   Box(double l, double h, double w) {
      this.l = l;
      this.h = h;
      this.w = w;
   }

   Box(Box old) {
      this.l = old.l;
      this.h = old.h;
      this.w = old.w;
   }

   public void information() {
      System.out.println("Running the Box");
   }
}
```
</details>

<details>
<summary>
<code>BoxWeight.java</code>
</summary>

```java
package OOP3;

public class BoxWeight extends Box {
   double weight;

   BoxWeight() {
      this.weight = -1;
   }

   BoxWeight(double side, double weight) {
      super(side);
      this.weight = weight;
   }

   BoxWeight(double l, double h, double w, double weight) {
      super(l, h, w);
      this.weight = weight;
   }
}

```

</details>

<details>
<summary>
<code>App.java</code>
</summary>

```java
package OOP3;

public class App {
   public static void main(String[] args) {
      Box box1 = new Box();
      System.out.println(box1.l + " " + " " + box1.w + " " + box1.h);

      BoxWeight bw = new BoxWeight();
      System.out.println(bw.weight + " " + bw.l + " " + " " + bw.w + " " + bw.h);

      Box ob1 = new BoxWeight(5.0, 10);
   }
}
```
</details>

A Second Use for super :
The second form of super acts somewhat like this, except that it always refers to the superclass of the subclass in which it is used.

`super.member`

Here, member can be either a `method` or an `instance variable`. ***This second form of super is most applicable to situations in which member names of a subclass hide members by the same name in the superclass***.

`super()` always refers to the constructor in the closest superclass. The `super()` in `BoxPrice` calls the constructor in `BoxWeight`. The `super()` in `BoxWeight` calls the constructor in `Box`.

> In a class hierarchy, if a superclass constructor requires parameters, then all subclasses must pass those parameters "up the line." This is true whether or not a subclass needs parameters of its own.

If you think about it, it makes sense that constructors complete their execution in order of derivation.
<u>***Because a superclass has no knowledge of any subclass, any initialization it needs to perform is separate from and possibly prerequisite to any initialization performed by the subclass. Therefore, it must complete its execution first.***</u>

> NOTE: If `super()` is not used in subclass' constructor, then the default or parameterless constructor of each superclass will be executed.


# Overloading

Overloading Methods:
In Java, it is possible to define two or more methods within the same class that share the same name, as long as their parameter declarations are different.
While overloaded methods may have different return types, the return type alone is insufficient to distinguish two versions of a method.
When Java encounters a call to an overloaded method, it simply executes the version of the method whose parameters match the arguments used in the call.
In some cases, Java's automatic type conversions can play a role in overload resolution, example int can be converted to double.

```java
class OverloadDemo {
    void test(double a){
        System.out.println("Inside test(double) a: " + a);
    }
}
class Overload {
   public static void main(String args[]) {
      OverloadDemo ob = new OverloadDemo();
      int i = 88;
      ob.test(i);        // this will invoke test(double)
      ob.test(123.2);    // this will invoke test(double)
   }
}
```
As you can see, this version of `OverloadDemo` does not define `test(int)`.
Therefore, when `test()` is called with an integer argument inside Overload, no matching method is found. However, Java can automatically convert an `integer` into a `double`, and this conversion can be used to resolve the call. Therefore, after `test(int)` is not found,
Java elevates `i` to `double` and then calls `test(double)`.
Of course, if `test(int)` had been defined, it would have been called instead.
> Java will employ its automatic type conversions only if no exact match is found.

Returning Objects:
```java
// Returning an object.
class Test {
   int a;
   Test(int i) {
      a = i;
   }
   Test incrByTen() {
      Test temp = new Test(a+10);
      return temp;
   }
}
class RetOb {
   public static void main(String args[]) {
      Test ob1 = new Test(2);
      Test ob2;
      ob2 = ob1.incrByTen();
      System.out.println("ob1.a: " + ob1.a);
      System.out.println("ob2.a: " + ob2.a);
   }
}

Output:
ob1.a: 2
ob2.a: 12
```

As you can see, each time `incrByTen()` is invoked, a new object is created, and a reference to it is returned to the calling routine.
Since all objects are dynamically allocated using `new`, you don't need to worry about an object going out-of-scope because the method in which it was created terminates.
> The object will continue to exist as long as there is a reference to it somewhere in your program.

When there are no references to it, the object will be reclaimed the next time garbage collection takes place.


# Overriding

In a class hierarchy, when a method in a subclass has the same name and type signature as a method in its superclass, then the method in the subclass is said to override the method in the superclass.
When an overridden method is called from within its subclass, it will always refer to the version of that method defined by the subclass. The version of the
method defined by the superclass will be hidden.

> <a>Method overriding occurs only when the names and the type signatures of the two methods are identical.</a>
> <a>If they are not, then the two methods are simply overloaded</a>.

(Check display functions in box classes)

### Dynamic Method Dispatch:

Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
Dynamic method dispatch is important because this is how Java implements run-time polymorphism.
Let's begin by restating an important principle: <a>a superclass reference variable can refer to a subclass object.</a>
When an overridden method is called through a superclass reference, Java determines which version of that method to execute *based upon the type of the object being referred to at the time the call occurs*. Thus, this determination is made at run time.
In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.

If B extends A then you can override a method in A through B with changing the return type of method to B.


# Using final with Inheritance:

The keyword final has three uses:

1. First, it can be used to create the equivalent of a named constant.

2. Using final to Prevent Overriding:
   1. To disallow a method from being overridden, specify final as a modifier at the start of its declaration.
   2. Methods declared as final cannot be overridden.
   3. Methods declared as final can sometimes provide a performance enhancement: The <u>compiler is free to inline calls to them because it "knows" they will not be overridden by a subclass.</u>
   4. When a <u>small final</u> method is called, often the <u>Java compiler can copy the bytecode for the subroutine directly inline with the compiled code of the calling method</u>, thus eliminating the costly overhead associated with a method call.
   5. Inlining is an option only with final methods. 
   6. *Normally, Java resolves calls to methods dynamically, at run time. This is called <a>late binding</a>*. However, since *final methods cannot be overridden, a call to one can be resolved at compile time. This is called <a>early binding</a>*.

3. Using final to Prevent Inheritance:
Sometimes you will want to prevent a class from being inherited. To do this, precede the class declaration with final.
NOTE: Declaring a class as final implicitly declares all of its methods as final, too.
As you might expect, it is illegal to declare a class as both abstract and final since an abstract class is incomplete by itself & relies upon its subclasses to provide complete implementations.

> NOTE: Although static methods can be inherited ,there is no point in overriding them in child classes because the method in parent class will run always no matter from which object you call it. 
> That is why static interface methods cannot be inherited because these method will run from the parent interface and no matter if we were allowed to override them, they will always run the method in parent interface.
That is why static interface method must have a body.

NOTE : Polymorphism does not apply to instance variables.


## Abstraction Vs Encapsulation 
![Abstraction Vs Encapsulation](assets/Abstraction%20Vs%20Encapsulation.png)
