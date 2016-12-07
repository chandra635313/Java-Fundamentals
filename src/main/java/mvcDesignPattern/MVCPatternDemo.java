package mvcDesignPattern;

public class MVCPatternDemo {

	public static void main(String[] args) {

		Employee model = new Employee("John", 1);
		EmployeeView view = new EmployeeView();
		
		EmplyeeController controller = new EmplyeeController(model, view);
		
		controller.updateView();
		
		controller.updateModel("Adam", 1);
		
		controller.updateView();
	}

}
