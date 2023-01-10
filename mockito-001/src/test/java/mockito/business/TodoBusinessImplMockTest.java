package mockito.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import mockito.data.api.ToDoService;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockTest {

	@Mock
	private ToDoService todoServiceMock;

//	 @Rule
//	  public MockitoRule rule = MockitoJUnit.rule();

	@InjectMocks
	TodoBusinessImpl todobusinessImpl;

	@Test
	public void testretrieveToDosRelatedToSpring_usingMock() {

//		ToDoService todoServiceMock  = mock(ToDoService.class);
		List<String> todos = Arrays.asList(" Dance in Spring", "rain in Spring", "I love Summer");
		when(todoServiceMock.retrieveTodos(Mockito.anyString())).thenReturn(todos);
		// todobusinessImpl.retrieveToDosRelatedToSpring(Mockito.anyString())

		List<String> filteredTodos = todobusinessImpl.retrieveToDosRelatedToSpring("DummyUser");
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void SimpleTest() {
		assertEquals(1, 1);
		TodoBusinessImpl business = mock(TodoBusinessImpl.class);
		business.retrieveToDosRelatedToSpring("ABC");
	}

//	@Test
//	void testretrieveToDosRelatedToSpring_usingStub2() {
//		ToDoService todoServiceStub  = new TodoServiceStub();
//		TodoBusinessImpl todobusinessImpl = new TodoBusinessImpl(todoServiceStub);
//
//    List<String> filteredTodos = todobusinessImpl.retrieveToDosRelatedToSpring("DummyUser1");
//    assertEquals(0, filteredTodos.size());

//    @Test
//	 public void testretrieveToDosRelatedToSpringWithEmpty() {
//		
//		ToDoService todoServiceMock  = mock(ToDoService.class);
//		List<String> todos = Arrays.asList();
//		when(todoServiceMock.retrieveTodos("DummyUser")).thenReturn(todos);
//		TodoBusinessImpl todobusinessImpl = new TodoBusinessImpl(todoServiceMock);
//
//    List<String> filteredTodos = todobusinessImpl.retrieveToDosRelatedToSpring("DummyUser");
//    assertEquals(0, filteredTodos.size());
//	}

    @Test
	public void testretrieveToDosRelatedToSpring_usingBDD() {
		//given
		ToDoService todoServiceMock  = mock(ToDoService.class);
		List<String> todos = Arrays.asList(" Dance in Spring","rain in Spring","I love Summer");
		given(todoServiceMock.retrieveTodos("DummyUser")).willReturn(todos);
		TodoBusinessImpl todobusinessImpl = new TodoBusinessImpl(todoServiceMock);
		//when
		List<String> filteredTodos = todobusinessImpl.retrieveToDosRelatedToSpring("DummyUser");
		//then
		assertThat(filteredTodos.size(), is(2));
	}

}
