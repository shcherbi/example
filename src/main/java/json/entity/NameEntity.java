package json.entity;

import org.codehaus.jackson.annotate.JsonProperty;

class NameEntity {
    @JsonProperty
    private String first;
    @JsonProperty
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
