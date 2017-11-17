package engpolWeb.dbModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "engpol")
@NamedQueries(value = {
        @NamedQuery(name = Engpol.FIND_ALL, query = "select e from  engpolWeb.dbModel.Engpol e")
})
public class Engpol implements Serializable {
    public static final String FIND_ALL = "engpol.findAll";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "eng_word")
    private String engWord;

    @Column(name = "pol_word")
    private String polWord;

    @Column(name = "eng_sentence")
    private String engSentence;

    @Column(name = "pol_sentence")
    private String polSentence;

    public Engpol() {
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

    @Override
    public String toString() {
        return "Engpol{" +
                "id=" + id +
                ", engWord='" + engWord + '\'' +
                ", polWord='" + polWord + '\'' +
                ", engSentence='" + engSentence + '\'' +
                ", polSentence='" + polSentence + '\'' +
                '}';
    }

    public void setPolSentence(String polSentence) {
        this.polSentence = polSentence;
    }
    //TODO: Add builder
}
