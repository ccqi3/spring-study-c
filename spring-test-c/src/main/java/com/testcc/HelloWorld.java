package com.testcc;

/**
 * @author qcc
 * @Package com.testcc
 * @Description: TODO
 * @date
 */
public class HelloWorld {
	private String message;

	public String getMessage() {
		System.out.println("Your Message : " + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init(){
		System.out.println("Bean is going through init.");
	}

	public void destroy(){
		System.out.println("Bean will destroy now.");
	}
}
