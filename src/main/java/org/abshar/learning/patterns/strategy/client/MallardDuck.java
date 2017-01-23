package org.abshar.learning.patterns.strategy.client;

import org.abshar.learning.patterns.strategy.encapsulatedbehaviors.fly.FlyWithWings;
import org.abshar.learning.patterns.strategy.encapsulatedbehaviors.quack.Quack;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
                flyBehavior = new FlyWithWings();
 

	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
