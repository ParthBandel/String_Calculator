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

// TODO: for single string it will return same string
public class singlestring {
    
@Test
	public void shouldReturnNumberOnSingleString() {
		assertEquals(1, Calculator.add("1"));
	}
}
