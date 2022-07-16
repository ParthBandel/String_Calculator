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
public class Customregex {
    
    //	TODO: Custom Delimiter can be custom Regex Character
	@Test
	public void shouldAllowRegexCharAsCustomDelimiter() {
		assertEquals(3,Calculator.add("//.\n1.2"));
	}
}
