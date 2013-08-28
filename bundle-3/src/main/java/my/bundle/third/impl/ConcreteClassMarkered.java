package my.bundle.third.impl;

import my.bundle.second.SecondAbstractClass;
import my.bundle.second.api.MarkerInterface;
import my.bundle.third.ConcreteInterface;

/**
 * @author R. Malyshev
 */
public class ConcreteClassMarkered extends SecondAbstractClass implements ConcreteInterface, MarkerInterface {
  @Override
  public void concreteMethod(){
    methodTwo();
    log.info("concreteMethod");
  }
}
