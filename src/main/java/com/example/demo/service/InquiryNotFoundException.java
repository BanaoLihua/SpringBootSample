package com.example.demo.service;

public class InquiryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InquiryNotFoundException(String message) {
		// 親クラスに渡す
		super(message);
	}
}
