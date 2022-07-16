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

// TODO: for empty string it will return zero
public class Empty {
    
        @Test
	 public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
}
