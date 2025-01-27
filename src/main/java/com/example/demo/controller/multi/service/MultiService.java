package com.example.demo.controller.multi.service;

import org.springframework.stereotype.Service;

/**
 * 計算処理を行うクラス
 */

@Service
public class MultiService {
	//掛け算をするメソッド
	public int multiNum(int num1, int num2) {
		return num1 * num2;
	}
	
}
