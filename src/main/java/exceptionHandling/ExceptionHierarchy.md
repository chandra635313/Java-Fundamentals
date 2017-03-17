## Exception Handling hierarchy

* In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked.

                  +--------------------------+
		   	      |		   Throwable 		 |
                  +--------------------------+
                    /       				\
		 
		          /         				  \
          +-------+      				    +-----------+
          | Error |        				    | Exception |
          +-------+       				    +-----------+
	          |           					  /         \
       	      |								 /           \
          unchecked   	          		checked	          unchecked
			                +--------------------+       +------------------+	
	             	        |CompiletimeException|	 	 | RuntimeException |
				        	+--------------------+       +------------------+
					   				  |							  |
					   				  |							  |
					   			IOException				  ArithmeticException
					   		(FileNotFoundException)		  NullPointerException
					  			 
