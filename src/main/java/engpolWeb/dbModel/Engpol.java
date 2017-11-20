package engpolWeb.dbModel;

import engpolWeb.jsfmodel.EngpolJsf;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "engpol")
@NamedQueries(value = {
        @NamedQuery(name = Engpol.FIND_ALL, query = "select e from  Engpol e"),
        @NamedQuery(name = Engpol.FIND_BY_ENGWORD, query = "select e from Engpol e where e.engWord = :engWord"),
        @NamedQuery(name = Engpol.FIND_BU_POLWORD, query = "select e from Engpol e where  e.polWord = :polWord")
})
public class Engpol implements Serializable {
    public static final String FIND_BY_ENGWORD = "engpol.fingByEngWord";
    public static final String FIND_BU_POLWORD = "engpol.fingByPolWord";
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

    private Engpol() {
    }

    private Engpol(EngpolFactory factory) {
//        this.id = factory.id;
        this.engWord = factory.engWord;
        this.polWord = factory.polWord;
        this.engSentence = factory.engSentence;
        this.polSentence = factory.polSentence;
    }

    public long getId() {
        return id;
    }

    public String getEngWord() {
        return engWord;
    }

    public String getPolWord() {
        return polWord;
    }

    public String getEngSentence() {
        return engSentence;
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


    public static class EngpolFactory {
        private long id;
        private String engWord;
        private String polWord;
        private String engSentence;
        private String polSentence;

        public EngpolFactory id(long id) {
            this.id = id;
            return this;
        }

        public EngpolFactory engWord(String engWord) {
            this.engWord = engWord;
            return this;
        }

        public EngpolFactory polWord(String polWord) {
            this.polWord = polWord;
            return this;
        }

        public EngpolFactory engSentence(String engSentence) {
            this.engSentence = engSentence;
            return this;
        }

        public EngpolFactory polSentence(String polSentence) {
            this.polSentence = polSentence;
            return this;
        }

        public EngpolFactory engpolJsf(EngpolJsf engpolJsf) {
            this.id = engpolJsf.getId();
            this.engWord = engpolJsf.getEngWord();
            this.polWord = engpolJsf.getPolWord();
            this.engSentence = engpolJsf.getEngSentence();
            this.polSentence = engpolJsf.getPolSentence();
            return this;
        }

        public Engpol build() {
            return new Engpol(this);
        }
    }
}
