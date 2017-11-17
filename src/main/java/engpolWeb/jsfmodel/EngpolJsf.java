package engpolWeb.jsfmodel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class EngpolJsf {

    private long id;
    private String engWord;
    private String polWord;
    private String engSentence;
    private String polSentence;

    public EngpolJsf() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEngWord() {
        return engWord;
    }

    public void setEngWord(String engWord) {
        this.engWord = engWord;
    }

    public String getPolWord() {
        return polWord;
    }

    public void setPolWord(String polWord) {
        this.polWord = polWord;
    }

    public String getEngSentence() {
        return engSentence;
    }

    public void setEngSentence(String engSentence) {
        this.engSentence = engSentence;
    }

    public String getPolSentence() {
        return polSentence;
    }

    public void setPolSentence(String polSentence) {
        this.polSentence = polSentence;
    }
}
