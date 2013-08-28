package my.bundle.second;

import my.bundle.one.FirstAbstractClass;

/**
 * @author R. Malyshev
 */
public abstract class SecondAbstractClass extends FirstAbstractClass {
  protected void methodTwo(){
    methodOne();
    log.info("methodTwo");
  }
}
