package engpolWeb.jsfmodel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named
@RequestScoped
public class Test {
    private List<String> lista = Arrays.asList("Paweł", "Jonasz", "Koteł", "Dupa", "Jasio");

    public Test() {
        System.out.println("Klasa Test");
        System.out.println(lista);
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}
