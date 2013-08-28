package my.bundle.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * If we comment out "implement SomeInterface" we get error:
 * Caused by: org.aspectj.weaver.reflect.ReflectionWorld$ReflectionWorldException: warning can't determine implemented interfaces of missing type my.bundle.one.FirstAbstractClass
 * instead of
 * Caused by: java.lang.IllegalArgumentException: warning no match for this type name: my.bundle.second.api.MarkerInterface [Xlint:invalidAbsoluteTypeName]
 * @author R. Malyshev
 */
public abstract class FirstAbstractClass implements SomeInterface {
  protected Logger log = LoggerFactory.getLogger(this.getClass());

  public void methodOne() {
    log.info("methodOne");
  }
}
