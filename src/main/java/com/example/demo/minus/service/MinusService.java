package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {
	//引き算を計算するメソッド
	public int calculateMinus(int leftNum, int rightNum) {
		return leftNum - rightNum;
	}

}
