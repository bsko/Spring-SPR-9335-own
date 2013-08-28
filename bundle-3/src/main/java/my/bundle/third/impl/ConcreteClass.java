package my.bundle.third.impl;

import my.bundle.second.SecondAbstractClass;
import my.bundle.third.ConcreteInterface;

/**
 * @author R. Malyshev
 */
public class ConcreteClass extends SecondAbstractClass implements ConcreteInterface {
  @Override
  public void concreteMethod(){
    methodTwo();
    log.info("concreteMethod");
  }
}
