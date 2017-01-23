package org.abshar.learning.patterns.strategy.simuduck.client;

import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly.FlyNoWay;
import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.quack.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
