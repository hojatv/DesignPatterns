package org.abshar.learning.patterns.strategy.simuduck;

import org.abshar.learning.patterns.strategy.simuduck.client.Duck;
import org.abshar.learning.patterns.strategy.simuduck.client.MallardDuck;
import org.abshar.learning.patterns.strategy.simuduck.client.ModelDuck;
import org.abshar.learning.patterns.strategy.simuduck.client.RubberDuck;
import org.abshar.learning.patterns.strategy.simuduck.encapsulatedbehaviors.fly.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		Duck.DecoyDuck decoy = new Duck.DecoyDuck();
 
		ModelDuck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
