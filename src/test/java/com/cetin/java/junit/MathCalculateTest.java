package com.cetin.java.junit;

import org.junit.jupiter.api.*;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class MathCalculateTest {
	MathCalculate mathCalculate;
	Supplier<String> supplier = ()-> "This test has been fail!!";

	TestInfo testInfo;

	TestReporter testReporter;

	@BeforeAll
	public void beforeAll(){
		System.out.println("Before all method calls");
	}
	@BeforeEach
	void setUp(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mathCalculate = new MathCalculate();
	}

	@Test
	@DisplayName(value = "Testing add method")
	@Tag("Math")
	void add() {
		System.out.println("Running " + testInfo.getDisplayName() + " with tags "+ testInfo.getTags());
		Assertions.assertEquals(5, mathCalculate.add(4,1), supplier);
	}

	@Test
	@RepeatedTest(3)
	@Tag("Circle")
	void competeCircleArea() {
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags "+ testInfo.getTags());
		Assertions.assertEquals(314, mathCalculate.competeCircleArea(10), supplier);
	}

	@Test
	@Tag("divide")
	void divide() {
		Assertions.assertThrows(ArithmeticException.class, ()-> mathCalculate.divide(1,0), supplier);
	}


	@Test
	@Disabled
	@DisplayName(value = "TDD test method")
	void tddMethod(){
		fail("This method should not run");
	}
}