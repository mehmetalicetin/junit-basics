package com.cetin.java.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculateTest {
	MathCalculate mathCalculate;

	@BeforeEach
	void setUp() {
		mathCalculate = new MathCalculate();
	}

	@Test
	void add() {
		Assertions.assertEquals(5, mathCalculate.add(4,1));
	}
}