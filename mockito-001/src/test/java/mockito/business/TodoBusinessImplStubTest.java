package mockito.business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import mockito.data.api.ToDoService;
import mockito.data.api.TodoServiceStub;

class TodoBusinessImplStubTest {

	@Test
	void testretrieveToDosRelatedToSpring_usingStub() {
		ToDoService todoServiceStub  = new TodoServiceStub();
		TodoBusinessImpl todobusinessImpl = new TodoBusinessImpl(todoServiceStub);

    List<String> filteredTodos = todobusinessImpl.retrieveToDosRelatedToSpring("DummyUser");
    assertEquals(2, filteredTodos.size());
	}
	
	@Test
	void testretrieveToDosRelatedToSpring_usingStub2() {
		ToDoService todoServiceStub  = new TodoServiceStub();
		TodoBusinessImpl todobusinessImpl = new TodoBusinessImpl(todoServiceStub);

    List<String> filteredTodos = todobusinessImpl.retrieveToDosRelatedToSpring("DummyUser1");
    assertEquals(0, filteredTodos.size());

	}
}
