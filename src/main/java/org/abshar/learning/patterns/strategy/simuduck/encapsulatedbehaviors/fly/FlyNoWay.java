package org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
