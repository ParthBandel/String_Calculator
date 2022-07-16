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

//Task - 2: Allow the Add method to handle an unknown amount of numbers
//TODO: for multiple strings separated by commas it will return sum of all
public class AddMethod {
    @Test
	public void shouldReturnSumOfAllNumbers() {
		assertEquals(6,Calculator.add("1,2,3"));
	}
    
}
