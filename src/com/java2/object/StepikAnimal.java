package com.java2.object;

public class StepikAnimal {

	public void say() {
		System.out.println("Hello");
	}
}

class Cat extends StepikAnimal {
	@Override
	public void say() {
		System.out.println("meow-meow");
	}
}

class Dog extends StepikAnimal {
	@Override
	public void say() {
		System.out.println("arf-arf");
	}

	class Duck extends StepikAnimal {
		@Override
		public void say() {
			System.out.println("quack-quack");
		}
	}
}
