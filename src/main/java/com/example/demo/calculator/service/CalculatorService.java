package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public String calculate(int leftNum, int rightNum, String operator) {
		int result = 0;

		try {
			if (operator.equals("+")) {
				result = leftNum + rightNum;
			} else if (operator.equals("-")) {
				result = leftNum - rightNum;
			} else if (operator.equals("×")) {
				result = leftNum * rightNum;
			} else if (operator.equals("÷")) {
				result = leftNum / rightNum;
			}
			return String.valueOf(result);

		} catch (ArithmeticException e) {
			return "ゼロ除算はできません";
		}

	}

}
