package org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.quack;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
