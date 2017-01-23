package org.abshar.learning.patterns.strategy.encapsulatedbehaviors.fly;

import org.abshar.learning.patterns.strategy.encapsulatedbehaviors.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
