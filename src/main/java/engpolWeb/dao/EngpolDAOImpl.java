package engpolWeb.dao;

import engpolWeb.dbModel.Engpol;
import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Stateless
public class EngpolDAOImpl implements EngpolDAO {


    @Inject
    private Logger logger;

    @Inject
    private EntityManager entityManager;

    @Override
    public List<Engpol> getAll() {
        List<Engpol> engpols = entityManager.createNamedQuery(Engpol.FIND_ALL, Engpol.class).getResultList();
        logger.info("getted Engpols {}", engpols);
        return engpols;
    }

    @Override
    public void delete(Engpol engpol) {
        logger.info("delete {}", engpol);
        entityManager.remove(engpol);
    }

    @Override
    public void save(Engpol engpol) {
        logger.info("save {}", engpol);
        entityManager.persist(engpol);
    }

    @Override
    public Engpol getById(long id) {
        logger.info("find by id: {}", id);
        return entityManager.find(Engpol.class, id);
    }
}
