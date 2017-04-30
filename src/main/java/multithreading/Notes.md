* ### Thread vs Process:
	* Threads are used for small tasks (run different components of the application), whereas processes are used for more heavyweight tasks – basically the execution of applications. 
	* Threads within the same process share the same address space, whereas different processes do not.
* ### Thread Creation:
  * Threads are created by:
      * Extending Thread class
      * Implementing Runnable Interface
  * When you are implementing Runnable interface, class object wont be treated as thread object. So we need to create a thread object, pass our class object to that thread object and then run the thread. 
      * For every class object, different thread object is required
  * This doesn't apply when you are extending thread abstract class. 
  * start() method implicitly calls run() method


* ### ThreadLocal:
	* The ThreadLocal class in Java enables you to create variables that can only be read and written by the same thread. 
	* If two threads are accessing ThreadLocal variable, then the two threads cannot see each other's ThreadLocal variables. 
      ```java
      private ThreadLocal myThreadLocal = new ThreadLocal();
      ```
   * As you can see, you instantiate a new ThreadLocal object. This only needs to be done once per thread. Even if different threads execute the same code which accesses a ThreadLocal, each thread will see only its own ThreadLocal instance.  

  * #### Generic ThreadLocal
  	* ThreadLocal of type T. 
    ```java
    private ThreadLocal<T> myThreadLocal = new ThreadLocal<T>();
    ```
   

* ### Workers thread: 
	* They are used to run tasks in background. 

* ### Deadlock:
    * One or more threads waiting on each other infinitely.

* ### Avoid Deadlock:
    * Avoid nested locks on objects
    * Avoid waiting indefinitely
    * Acquire lock only if required
    * Acquire locks in a ordered sequence

* ### Callable vs Runnable Interface:
    | Callable        | Runnable                  | 
    | -------------   |-------------              |
    | ``` V call() throws Exception ```     | ``` void run() ```|
    |   Return a Value V   | void     				  |
    |   Throws Exception   | Doesn't Throws Exception     				  |
	


* ### Synchronized block vs Synchronized method:
	*  Synchronized block: Good practice
		* Reduce scope of lock, as scope of lock is inversely proportional to performance.
		* Lock is acquired at the start of the block and released at the end of the block.
	*  Synchronized Method:
		* Lock on Entire object
		* synchronized keyword on the method declaration will synchronize the whole method to the object or class.   


