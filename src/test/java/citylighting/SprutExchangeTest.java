package citylighting;


import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import ru.smartsarov.citylighting.SprutExchange;



public class SprutExchangeTest {

	@Test
	public void testGetConnection() throws ClassNotFoundException, SQLException{
		int source = -1;
		String expected = "{}";
		String actual = SprutExchange.showStateById(source);
		assertEquals("Unexpected value in method", expected, actual);
	}
}
