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

// TODO: for two strings separated by commas it will return sum of the two
public class TwoString {
    
        @Test
	public void shouldReturnSumOfNumbersOnTwoStrings() {
		assertEquals(3, Calculator.add("1,2"));
	}
}
