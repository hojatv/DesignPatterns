package org.abshar.learning.patterns.strategy.simuduck.client;

import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly.FlyWithWings;
import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.quack.Quack;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
                flyBehavior = new FlyWithWings();
 

	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
