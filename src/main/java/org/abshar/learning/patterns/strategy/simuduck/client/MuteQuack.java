package org.abshar.learning.patterns.strategy.simuduck.client;

import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
