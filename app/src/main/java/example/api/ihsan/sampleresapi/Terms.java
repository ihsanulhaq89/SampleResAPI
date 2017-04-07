package example.api.ihsan.sampleresapi;

public class Terms extends BaseApiResponse{

    String name;
    String term;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
