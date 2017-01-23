package org.abshar.learning.patterns.strategy.client;

import org.abshar.learning.patterns.strategy.encapsulatedbehaviors.fly.FlyWithWings;
import org.abshar.learning.patterns.strategy.encapsulatedbehaviors.quack.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
