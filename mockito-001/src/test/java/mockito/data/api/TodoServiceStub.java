package mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ToDoService {
	
	public List<String> retrieveTodos(String user){
		return Arrays.asList(" Dance in Spring","rain in Spring","I love Summer");
	}

}
