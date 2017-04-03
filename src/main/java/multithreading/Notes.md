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

* ### Workers thread: 
	* They are used to run tasks in background. 

* ### Deadlock:
    * One thread waiting on another thread
* ### Avoid Deadlock:
    * Avoid nested locks on objects
    * Avoid waiting indefinitely
    * Acquire lock only if required

