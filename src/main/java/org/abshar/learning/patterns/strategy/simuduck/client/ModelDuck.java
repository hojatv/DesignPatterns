package org.abshar.learning.patterns.strategy.simuduck.client;

import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly.FlyNoWay;
import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.quack.Quack;


public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
