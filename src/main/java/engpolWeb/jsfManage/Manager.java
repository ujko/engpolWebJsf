package engpolWeb.jsfManage;

import engpolWeb.dao.EngpolDAO;
import engpolWeb.dbModel.Engpol;
import engpolWeb.jsfmodel.EngpolJsf;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "manager")
@ViewScoped
public class Manager implements Serializable {
    private List<Engpol> engpols;
    private List<Engpol> filteredEngpols;
    private EngpolJsf engpolJsf = new EngpolJsf();

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

    public String newEngpol() {
        logger.debug("{}", engpolJsf);
        return "new.xhtml";
    }

    public String saveEngpol() {
        Engpol engpol = new Engpol.EngpolFactory().engpolJsf(engpolJsf).build();
        logger.debug("Saves Engpol {}", engpol);
        engpolDAO.save(engpol);
        return "index.xhtml";
    }

    public List<Engpol> getFilteredEngpols() {
        logger.debug("get: {}", filteredEngpols);
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

    public EngpolJsf getEngpolJsf() {
        logger.debug("{}", engpolJsf);
        return engpolJsf;
    }

    public void setEngpolJsf(EngpolJsf engpolJsf) {
        logger.debug("{}", engpolJsf);
        this.engpolJsf = engpolJsf;
    }

    public String setIndexPage() {
        logger.debug("Return to index.xhtml with no save");
        return "index.xhtml";
    }
}
