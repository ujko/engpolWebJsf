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
import java.util.stream.Collectors;

@Named
@RequestScoped
public class Manager implements Serializable {
    private List<Engpol> engpols;
    private List<Engpol> filteredEngpols;
    private String find;


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

    public String getFind() {
        return find;
    }

    public void setFind(String find) {
        this.find = find;
    }

    public List<Engpol> getFilteredEngpols() {
        logger.debug("get: {}",filteredEngpols);
        return filteredEngpols;
    }

    public void setFilteredEngpols(List<Engpol> filteredEngpols) {
        logger.debug("set: {}", filteredEngpols);
        this.filteredEngpols = filteredEngpols;
    }

    public List<Engpol> getEngpols() {
        logger.info("in getEnpols method");
        return engpols;
    }

    public void setEngpols(List<Engpol> engpols) {
        this.engpols = engpols;
    }
}
