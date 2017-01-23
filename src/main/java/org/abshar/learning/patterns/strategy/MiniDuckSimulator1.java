package org.abshar.learning.patterns.strategy;

import org.abshar.learning.patterns.strategy.client.Duck;
import org.abshar.learning.patterns.strategy.client.MallardDuck;
import org.abshar.learning.patterns.strategy.client.ModelDuck;
import org.abshar.learning.patterns.strategy.encapsulatedbehaviors.fly.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
