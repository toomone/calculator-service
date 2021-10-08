package com.octodemo.rest.calculatorservice;

import com.octodemo.rest.calculatorservice.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceApplicationTests {

	String x = "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";

	@Test
	void contextLoads() {
	}

	@Test
	void calculator() {
		CalculatorService cal = new CalculatorService();
		assertEquals(2, cal.addition(1,1));
	}

}
