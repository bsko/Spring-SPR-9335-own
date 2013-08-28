package my.bundle.second.api;

/**
 * If we place this definition in package my.bundle.second we get error:
 * Caused by: org.aspectj.weaver.reflect.ReflectionWorld$ReflectionWorldException: warning can't determine implemented interfaces of missing type my.bundle.one.FirstAbstractClass
 * instead of
 * Caused by: java.lang.IllegalArgumentException: warning no match for this type name: my.bundle.second.api.MarkerInterface [Xlint:invalidAbsoluteTypeName]
 *
 * @author R. Malyshev
 */
public interface MarkerInterface {
}
