package org.abshar.learning.patterns.strategy.simuduck.client;

import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly.FlyBehavior;
import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly.FlyNoWay;
import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
 
	public Duck() {
	}

	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
 
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
 
	abstract void display();
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public static class DecoyDuck extends Duck {
        public DecoyDuck() {
            setFlyBehavior(new FlyNoWay());
            setQuackBehavior(new MuteQuack());
        }
        public void display() {
            System.out.println("I'm a duck Decoy");
        }
    }

	public static class FakeQuack implements QuackBehavior {
        public void quack() {
            System.out.println("Qwak");
        }
    }
}
