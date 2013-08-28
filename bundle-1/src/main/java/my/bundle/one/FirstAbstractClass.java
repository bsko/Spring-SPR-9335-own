package my.bundle.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author R. Malyshev
 */
public abstract class FirstAbstractClass {
  protected Logger log = LoggerFactory.getLogger(this.getClass());

  public void methodOne() {
    log.info("methodOne");
  }
}
