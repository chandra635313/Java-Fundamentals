## Abstraction 

1. There are two ways to achieve abstraction in java:
	* Abstract class
	* Interface
2. Abstraction is a process of hiding the implementation details and showing only functionality to the user.
3. A class that is declared with abstract keyword, is known as abstract class in java. 
4. It can have abstract (just method signature) and non-abstract methods (method with body).
5. It cannot be instantiated.
6. An abstract class can have fields (state), abstract method, non abstract method, constructor and main() method.
7. Adapter class feature: The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.
8. Abstract class vs Interface:

| Abstract class        | Interface           | 
| :------------- |:-------------|
| abstract and non-abstract methods     | only abstract methods | 
| Can have final, non-final, static and non-static variables.      | only static and final variables      |  
| Can provide the implementation of interface | Can't provide the implementation of abstract class      | 

9. [When would you use an interface instead of an abstract class or vice-versa?](https://msdn.microsoft.com/en-us/library/scsyfw1d%28v=vs.71%29.aspx?f=255&MSPPError=-2147217396)
	* If you are gonna create different versions of your component and you need a common functionality for all those versions, then use abstract class. By updating the base class, all inheriting classes are automatically updated with the change. Interfaces, on the other hand, cannot be changed once created. If a new version of an interface is required, you must create a whole new interface.
	* Interfaces are best suited for providing common functionality to unrelated classes whereas Abstract classes should be used for closely related objects. 
	* Abstract classes allow you to partially implement your class, whereas interfaces contain no implementation for any members. 
