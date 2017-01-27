package org.abshar.learning.patterns.strategy.simuduck;

import org.abshar.learning.patterns.strategy.simuduck.client.Duck;
import org.abshar.learning.patterns.strategy.simuduck.client.MallardDuck;
import org.abshar.learning.patterns.strategy.simuduck.client.ModelDuck;
import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		//TEST
	}
}
