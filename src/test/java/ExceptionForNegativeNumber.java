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
public class ExceptionForNegativeNumber {
    
    //	Task - 5: Throw Exception for negative numbers
	//	TODO: Throw exception for negative numbers
	@Test
	public void shouldThrowExceptionForNegativeNumbers() {
		try{
			Calculator.add("1,-2,3");
			fail("Exception expected");
		}catch(RuntimeException e) {
		}
	}
}
