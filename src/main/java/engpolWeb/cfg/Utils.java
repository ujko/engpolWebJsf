package engpolWeb.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Utils {

    @Produces
    @PersistenceContext(unitName = "engpol")
    private static EntityManager entityManager;

    @Produces
    public Logger getLogger(InjectionPoint point) {
        return LoggerFactory.getLogger(point.getMember().getDeclaringClass().getName());
    }
}
