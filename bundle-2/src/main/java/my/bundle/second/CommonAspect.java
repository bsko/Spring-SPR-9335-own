package my.bundle.second;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author R. Malyshev
 */
@Aspect
public class CommonAspect {
  private static Logger log = LoggerFactory.getLogger(CommonAspect.class);

  @Before("within(my.bundle..*) && target(my.bundle.second.api.MarkerInterface)")
  public void printSuccess() {
    log.info("THIS IS ASPECT");
  }
}
