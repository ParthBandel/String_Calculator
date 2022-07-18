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

//	Task - 3: Allow the Add method to handle new lines between numbers (instead of commas)
//	TODO: Allow \n as delimiter along-with comma
public class delimiter {
    @Test
	public void shouldAllowNewLineAsDelimiter() {
		assertEquals(6,Calculator.add("1\n2,3"));
	}
    
 }
