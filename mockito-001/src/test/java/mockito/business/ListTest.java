package mockito.business;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import static org.mockito.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	public void test() {
		List ListMock = mock(List.class);
		when(ListMock.size()).thenReturn(2);
		assertEquals(2, ListMock.size());
	}
	@Test
	public void testReturnMultipleValues() {
		List ListMock = mock(List.class);
		when(ListMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, ListMock.size());
		assertEquals(3, ListMock.size());
		
		
	}
	@Test
	public void MockTestGet_usingBDD() {
		//given
		List<String> ListMock = mock(List.class);
		given(ListMock.get(anyInt())).willReturn("Success");
		//when
		String firstElement = ListMock.get(0);
		//then
		assertThat(firstElement, is("Success"));
		
	}

}
