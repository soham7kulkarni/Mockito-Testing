package mockito.business;

import java.util.ArrayList;
import java.util.List;

import mockito.data.api.ToDoService;

public class TodoBusinessImpl {

	
	
	
	
	private ToDoService todoservice;

	public TodoBusinessImpl(ToDoService todoService) {
		super();
		this.todoservice = todoService;
	}

	public TodoBusinessImpl() {
		super();
	}

	public List<String> retrieveToDosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoservice.retrieveTodos(user);
		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}

		}
		return filteredTodos;
	}

}
