package engpolWeb.jsfmodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

public class EngpolJsf implements Serializable {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    private long id;
    private String engWord;
    private String polWord;
    private String engSentence;
    private String polSentence;

    public EngpolJsf() {
        logger.debug("EngpolJsf new instance");
    }

    public long getId() {
        logger.debug(" get Id: {}", id);
        return id;
    }

    public void setId(long id) {
        logger.debug(" set Id: {}", id);
        this.id = id;
    }

    public String getEngWord() {
        logger.debug(" get engWord: {}", engWord);
        return engWord;
    }

    public void setEngWord(String engWord) {
        logger.debug(" set engWord: {}", engWord);
        this.engWord = engWord;
    }

    public String getPolWord() {
        logger.debug(" get polWord: {}", polWord);
        return polWord;
    }

    public void setPolWord(String polWord) {
        logger.debug(" set polWord: {}", polWord);
        this.polWord = polWord;
    }

    public String getEngSentence() {
        logger.debug(" get EngSentence: {}", engSentence);
        return engSentence;
    }

    public void setEngSentence(String engSentence) {
        logger.debug(" set EngSentence: {}", engSentence);
        this.engSentence = engSentence;
    }

    public String getPolSentence() {
        logger.debug(" get PolSentence: {}", polSentence);
        return polSentence;
    }

    public void setPolSentence(String polSentence) {
        logger.debug(" set PolSentence: {}", polSentence);
        this.polSentence = polSentence;
    }

    @Override
    public String toString() {
        return "EngpolJsf{" +
                "id=" + id +
                ", engWord='" + engWord + '\'' +
                ", polWord='" + polWord + '\'' +
                ", engSentence='" + engSentence + '\'' +
                ", polSentence='" + polSentence + '\'' +
                '}';
    }
}
