package org.abshar.learning.patterns.strategy.client;

import org.abshar.learning.patterns.strategy.encapsulatedbehaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
