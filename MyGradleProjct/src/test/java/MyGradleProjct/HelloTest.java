package MyGradleProjct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest extends Hello {

	
	@Test
	void testGetName() 
	{
		assertEquals("theepak",getName());
	}

}
