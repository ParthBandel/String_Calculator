/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bande
 */
public class Customdelimiter {
    //	Task - 4: Support different delimiters
	//	TODO: Allow custom delimiter by checking // in beginning of first line
	@Test
	public void shouldAllowCustomDelimiter() {
		assertEquals(3,Calculator.add("//;\n1;2"));
	}
}
