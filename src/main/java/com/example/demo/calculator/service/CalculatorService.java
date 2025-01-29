package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	//計算処理メソッド
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
			//慶安結果を文字列に変換して返す
			return String.valueOf(result);

		} catch (ArithmeticException e) {
			//例外(ゼロ除算)
			return "ゼロ除算はできません";
		}

	}

}
