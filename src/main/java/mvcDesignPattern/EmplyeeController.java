package mvcDesignPattern;

public class EmplyeeController {

	Employee model;
	EmployeeView view;
	
	public EmplyeeController(Employee model, EmployeeView view){
		this.model = model;
		this.view = view;
	}
	
	public void updateModel(String name, int id){
		model.setName(name);
		model.setId(id);
	}
	
	public void updateView(){
		view.printEmployee(model.getName(), model.getId());
	}

}
