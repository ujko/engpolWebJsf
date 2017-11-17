package engpolWeb.jsfManage;

import engpolWeb.dao.EngpolDAO;
import engpolWeb.dbModel.Engpol;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class Manager implements Serializable {
    List<Engpol> engpols;

    @Inject
    private Logger logger;

    @Inject
    private EngpolDAO engpolDAO;

    public Manager() {
    }

    @PostConstruct
    public void postConstruct() {
        engpols = engpolDAO.getAll();

    }

    public List<Engpol> getEngpols() {
        logger.info("in getEnpols method");
        return engpols;
    }

    public void setEngpols(List<Engpol> engpols) {
        this.engpols = engpols;
    }

    public void createData() {
//         Engpol e = engpolDAO.getById(1l);
//        List<Engpol> en = engpolDAO.getAll();
//        logger.info("Engpols: {}", en);

    }
}
