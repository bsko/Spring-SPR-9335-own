package my.bundle.forth;

import my.bundle.third.ConcreteInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.osgi.service.importer.OsgiServiceLifecycleListener;

import java.util.Map;

/**
 * @author R. Malyshev
 */
public class Listener implements OsgiServiceLifecycleListener {
  private static Logger log = LoggerFactory.getLogger(Listener.class);

  @Override
  public void bind(Object o, Map map) throws Exception {
    log.info("!!! BEFORE");
    ((ConcreteInterface)o).concreteMethod();
    log.info("!!! AFTER");
  }

  @Override
  public void unbind(Object o, Map map) throws Exception {

  }
}
