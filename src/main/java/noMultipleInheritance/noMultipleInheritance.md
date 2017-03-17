## Class extending more than one class Java?

* In Java multiple inheritance is not permitted. 
* It was excluded from the language as a design decision, primarily to avoid circular dependencies.

* Approach 1: Cannot extend two classes:
```
public class C extends A, B{

}
```
* Approach 2: Below is possible:
```
public class B extends A{

}

public class C extends B{

}
```
* The difference in these two approaches is that in the second approach there is a clearly defined parent or super class, while in the first approach the super class is ambiguous.

* Consider if both A and B had a method print(). In first approach which parent method would be called if we called c.print()? whereas in second approach we know calling c.print() would call the B class print method as long as C had not overridden it.
