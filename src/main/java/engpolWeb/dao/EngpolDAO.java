package engpolWeb.dao;

import engpolWeb.dbModel.Engpol;

import java.util.List;

public interface EngpolDAO {

    public List<Engpol> getAll();
    public void delete(Engpol engpol);
    public void save(Engpol engpol);
    public Engpol getById(long id);
}
